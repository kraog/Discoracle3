package eris.om.discoracle3.viewmodel;

import android.databinding.ObservableField;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import rx.Observable;

/**
 * Created by Gorka on 11/04/2016.
 */
public class UserFragmentVM {
    private InputMethodManager inputMethodManager;
    public UserFragmentListener mUserFragmentListener;
    public ObservableField<String> question;

    public UserFragmentVM(UserFragmentListener mUserFragmentListener ){
        this.mUserFragmentListener = mUserFragmentListener;
        this.question = new ObservableField<String>();
    }
    public interface UserFragmentListener {
        public void onUserTextEntered(String question);
    }

    public void onUserTextEnter(EditText view){
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        mUserFragmentListener.onUserTextEntered(view.getText().toString());
    }

}
