package eris.om.discoracle3.viewmodel;

import android.view.View;

/**
 * Created by Gorka on 11/04/2016.
 */
public class OracleVM {
    public OracleListener mOracleListener;
    public OracleVM(OracleListener mOracleListener){
        this.mOracleListener = mOracleListener;
    }
    public interface OracleListener {
        public void onTextEntered();
        public void onUserButtonClicked();
    }

    public void onTextEnter(View view){
        mOracleListener.onTextEntered();
    }

    public void onUserButtonClick(View view){
        mOracleListener.onUserButtonClicked();
    }
}
