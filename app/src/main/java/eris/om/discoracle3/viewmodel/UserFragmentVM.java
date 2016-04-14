package eris.om.discoracle3.viewmodel;

import android.content.Context;
import android.databinding.ObservableField;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import rx.Observable;

/**
 * Created by Gorka on 11/04/2016.
 */
public class UserFragmentVM {
    public UserFragmentListener mUserFragmentListener;
    public ObservableField<String> question;

    public UserFragmentVM(UserFragmentListener mUserFragmentListener ){
        this.mUserFragmentListener = mUserFragmentListener;
        this.question = new ObservableField<String>();
    }
    public interface UserFragmentListener {
        public void onUserTextEntered(String question);
    }


    public View.OnKeyListener getCustomKeyListener(){
        return new View.OnKeyListener() {
        @Override
        public boolean onKey(View v, int keyCode, KeyEvent event) {
            if (event.getAction()==KeyEvent.ACTION_DOWN) {
                mUserFragmentListener.onUserTextEntered(((EditText) v).getText().toString());
                question.set("");
            }
            return true;
        }
    };
    }

}
