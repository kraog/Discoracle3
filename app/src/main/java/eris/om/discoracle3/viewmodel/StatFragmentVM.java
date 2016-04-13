package eris.om.discoracle3.viewmodel;

import android.view.View;

/**
 * Created by Gorka on 11/04/2016.
 */
public class StatFragmentVM {
    public StatFragmentListener mStatFragmentListener;

    public StatFragmentVM(StatFragmentListener mStatFragmentListener){
        this.mStatFragmentListener = mStatFragmentListener;
    }
    public interface StatFragmentListener {
        public void onChangeUserButtonClicked();
    }

    public void onChangeUserButtonClick(View view){
        mStatFragmentListener.onChangeUserButtonClicked();
    }

}
