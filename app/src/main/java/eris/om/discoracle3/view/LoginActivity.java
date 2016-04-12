package eris.om.discoracle3.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import eris.om.discoracle3.R;
import eris.om.discoracle3.databinding.LoginActivityBinding;
import eris.om.discoracle3.viewmodel.LoginVM;

public class LoginActivity extends AppCompatActivity implements LoginVM.LoginListener {

    LoginActivityBinding lab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lab = DataBindingUtil.setContentView(this,R.layout.login_activity);
        lab.setLoginVM(new LoginVM(this));
        lab.inflate(getLayoutInflater());
        Picasso.with(this).load("http://pre07.deviantart.net/d9bd/th/pre/f/2014/047/d/1/magic_seal_of_9_by_lemonninja-d76thf7.jpg").into(lab.appIconLogin);
        Picasso.with(this).load("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Sacred-Chao.svg/2000px-Sacred-Chao.svg.png").
                resize(90,90).
                centerInside().
                into(lab.loginButtonLogin);
    }

    @Override
    public void onButtonClicked() {
        String name = lab.nameInsertBoxLogin.getText().toString();
        Intent intentLogToOra = new Intent(this,OracleActivity.class);
        intentLogToOra.putExtra("name",name);
        this.startActivityForResult(intentLogToOra,0);
    }

    @Override
    public void onNameEntered() {
        //TODO
    }
}
