package eris.om.discoracle3.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import eris.om.discoracle3.R;
import eris.om.discoracle3.databinding.UserFragmentBinding;
import eris.om.discoracle3.viewmodel.UserFragmentVM;

/**
 * Created by Gorka on 12/04/2016.
 */
public class UserFragment extends Fragment implements UserFragmentVM.UserFragmentListener {
    public static final String TAG = "UF";
    public String username;

    public static UserFragment newInstance(String username){
        UserFragment uf = new UserFragment();
        uf.username = username;
        return uf;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        UserFragmentBinding ufbinding = DataBindingUtil.inflate(inflater, R.layout.user_fragment, container, false);
        ufbinding.setUserFVM(new UserFragmentVM(this));
        Picasso.with(ufbinding.getRoot().getContext()).
                load("https://upload.wikimedia.org/wikipedia/commons/0/03/Jacinto_Benavente.jpg").
                into(ufbinding.userIcon);
        ufbinding.userConversationBox.setText("soy "+username);
        return ufbinding.getRoot();
    }
    @Override
    public void onTextEntered() {

    }
}
