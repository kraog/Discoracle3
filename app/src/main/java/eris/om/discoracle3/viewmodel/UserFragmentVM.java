package eris.om.discoracle3.viewmodel;

import android.view.View;

/**
 * Created by Gorka on 11/04/2016.
 */
public class UserFragmentVM {
    public UserFragmentListener mUserFragmentListener;

    public UserFragmentVM(UserFragmentListener mUserFragmentListener ){
        this.mUserFragmentListener = mUserFragmentListener;
    }
    public interface UserFragmentListener {
        public void onTextEntered();
    }

    public void onTextEnter(View view){
        mUserFragmentListener.onTextEntered();
    }

}
