package eris.om.discoracle3.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import eris.om.discoracle3.R;
import eris.om.discoracle3.databinding.OracleFragmentBinding;
import eris.om.discoracle3.viewmodel.OracleFragmentVM;

/**
 * Created by Gorka on 12/04/2016.
 */
public class OracleFragment extends Fragment {
    public static final String TAG = "OF";
    public OracleFragmentVM oracleFVM;
    public OracleFragmentBinding ofbinding;

    public static OracleFragment newInstance(OracleFragmentVM.OracleFragmentListener ofl){
        OracleFragment of = new OracleFragment();
        of.oracleFVM = new OracleFragmentVM(ofl);
        return of;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ofbinding = DataBindingUtil.inflate(inflater,R.layout.oracle_fragment,container,false);
        ofbinding.setOracleFVM(oracleFVM);
        Picasso.with(ofbinding.getRoot().getContext())
                .load("https://openclipart.org/image/800px/svg_to_png/205628/ErisDiscordiabw.png")
                .resize(100,100)
                .centerInside()
                .into(ofbinding.oracleIcon);
        ofbinding.oracleConversationBox.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                oracleFVM.mOracleFragmentListener.onOracleTextEntered();
            }
        });
        return ofbinding.getRoot();
    }
}
