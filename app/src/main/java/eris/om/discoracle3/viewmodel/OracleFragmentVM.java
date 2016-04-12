package eris.om.discoracle3.viewmodel;

import android.view.View;

/**
 * Created by Gorka on 11/04/2016.
 */
public class OracleFragmentVM {
    public OracleFragmentListener mOracleFragmentListener;

    public OracleFragmentVM(OracleFragmentListener ofl){
        this.mOracleFragmentListener = ofl;
    }
    public interface OracleFragmentListener {
        public void onTextEntered();
    }

    public void onTextEnter(View view){
        mOracleFragmentListener.onTextEntered();
    }

}
