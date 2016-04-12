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
import eris.om.discoracle3.databinding.OracleFragmentBinding;
import eris.om.discoracle3.viewmodel.OracleFragmentVM;

/**
 * Created by Gorka on 12/04/2016.
 */
public class OracleFragment extends Fragment implements OracleFragmentVM.OracleFragmentListener {
    public static final String TAG = "OF";

    public OracleFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        OracleFragmentBinding ofbinding = DataBindingUtil.inflate(inflater,R.layout.oracle_fragment,container,false);
        ofbinding.setOracleFVM(new OracleFragmentVM(this));
        Picasso.with(ofbinding.getRoot().getContext()).
                load("https://openclipart.org/image/800px/svg_to_png/205628/ErisDiscordiabw.png").
                into(ofbinding.oracleIcon);
        return ofbinding.getRoot();
    }
    @Override
    public void onTextEntered() {

    }
}
