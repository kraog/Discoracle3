package eris.om.discoracle3.view;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import eris.om.discoracle3.R;
import eris.om.discoracle3.databinding.OracleActivityBinding;
import eris.om.discoracle3.viewmodel.OracleVM;

public class OracleActivity extends AppCompatActivity implements OracleVM.OracleListener {
    private FragmentManager fmanager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        OracleActivityBinding oabinding = DataBindingUtil.setContentView(this, R.layout.oracle_activity);
        oabinding.setOracleVM(new OracleVM(this));
        FragmentTransaction transaction = fmanager.beginTransaction();
        OracleFragment ofragment = new OracleFragment();
        StatFragment sfragment = new StatFragment();
        UserFragment ufragment = UserFragment.newInstance(this.getIntent().getExtras().getString("name"));
        transaction.add(R.id.oracle_fragment,ofragment,OracleFragment.TAG);
        transaction.add(R.id.user_fragment, ufragment, UserFragment.TAG);
        transaction.add(R.id.stat_fragment, sfragment, StatFragment.TAG);
        transaction.commit();
    }

    @Override
    public void onTextEntered() {

    }

    @Override
    public void onUserButtonClicked() {

    }
}
