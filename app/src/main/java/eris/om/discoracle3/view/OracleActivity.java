package eris.om.discoracle3.view;

import android.content.Context;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

import eris.om.discoracle3.R;
import eris.om.discoracle3.databinding.OracleActivityBinding;
import eris.om.discoracle3.viewmodel.OracleFragmentVM;
import eris.om.discoracle3.viewmodel.OracleVM;
import eris.om.discoracle3.viewmodel.StatFragmentVM;
import eris.om.discoracle3.viewmodel.UserFragmentVM;
import rx.Observable;
import rx.Subscriber;
import rx.observers.TestSubscriber;

public class OracleActivity extends AppCompatActivity
        implements OracleVM.OracleListener,
        OracleFragmentVM.OracleFragmentListener,
        StatFragmentVM.StatFragmentListener,
        UserFragmentVM.UserFragmentListener {

    private FragmentManager fmanager = getSupportFragmentManager();
    public OracleFragment ofragment;
    public StatFragment sfragment;
    public UserFragment ufragment;
    private EditText userBox;
    private TextView oraculoBox;
    private InputMethodManager inputMethodManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        OracleActivityBinding oabinding = DataBindingUtil.setContentView(this, R.layout.oracle_activity);
        oabinding.setOracleVM(new OracleVM(this));
        FragmentTransaction transaction = fmanager.beginTransaction();
        ofragment = OracleFragment.newInstance(this);
        sfragment = StatFragment.newInstance(this);
        ufragment = UserFragment.newInstance(this,this.getIntent().getExtras().getString("name"));
        transaction.add(R.id.oracle_fragment, ofragment, OracleFragment.TAG);
        transaction.add(R.id.user_fragment, ufragment, UserFragment.TAG);
        transaction.add(R.id.stat_fragment, sfragment, StatFragment.TAG);
        transaction.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        oraculoBox = ofragment.ofbinding.oracleConversationBox;
        userBox = ufragment.ufbinding.userConversationBox;
        inputMethodManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

    }

    @Override
    public void onOracleTextEntered() {

    }

    @Override
    public void onTextEntered() {

    }

    @Override
    public void onUserButtonClicked() {

    }

    @Override
    public void onChangeUserButtonClicked() {

    }

    @Override
    public void onUserTextEntered(String question) {
        ofragment.oracleFVM.onOracleAsked(question);
    }
}
