package eris.om.discoracle3.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import eris.om.discoracle3.R;
import eris.om.discoracle3.databinding.UserFragmentBinding;
import eris.om.discoracle3.viewmodel.UserFragmentVM;

/**
 * Created by Gorka on 12/04/2016.
 */
public class UserFragment extends Fragment {
    public static final String TAG = "UF";
    public String username;
    public UserFragmentVM userFVM;
    public UserFragmentBinding ufbinding;

    public static UserFragment newInstance(UserFragmentVM.UserFragmentListener ufl, String username){
        UserFragment uf = new UserFragment();
        uf.username = username;
        uf.userFVM = new UserFragmentVM(ufl);
        return uf;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ufbinding = DataBindingUtil.inflate(inflater, R.layout.user_fragment, container, false);
        ufbinding.setUserFVM(userFVM);
        Picasso.with(ufbinding.getRoot().getContext()).
                load("https://upload.wikimedia.org/wikipedia/commons/0/03/Jacinto_Benavente.jpg")
                .resize(100,100)
                .centerInside()
                .into(ufbinding.userIcon);
        return ufbinding.getRoot();
    }
}
