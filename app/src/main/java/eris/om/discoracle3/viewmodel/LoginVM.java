package eris.om.discoracle3.viewmodel;

import android.view.View;

/**
 * Created by Gorka on 11/04/2016.
 */
public class LoginVM {
    public LoginListener mLoginListener;

    public LoginVM(final LoginListener mLoginListener){
        this.mLoginListener = mLoginListener;
    }
    public interface LoginListener {
        public void onButtonClicked();
        public void onNameEntered();
    }

    public void onButtonClick(View view){
        mLoginListener.onButtonClicked();
    }

    public void onNameEnter(View view){
        mLoginListener.onNameEntered();
    }
}
