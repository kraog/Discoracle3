package eris.om.discoracle3.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import eris.om.discoracle3.R;
import eris.om.discoracle3.databinding.StatFragmentBinding;
import eris.om.discoracle3.databinding.UserFragmentBinding;
import eris.om.discoracle3.viewmodel.StatFragmentVM;
import eris.om.discoracle3.viewmodel.UserFragmentVM;

/**
 * Created by Gorka on 12/04/2016.
 */
public class StatFragment extends Fragment{
    public static final String TAG = "SF";
    public static final int BIEN = 0;
    public static final int MAL = 1;
    public static final int PEOR = 2;

    public StatFragmentVM statFVM;
    public StatFragmentBinding sfbinding;


    public static StatFragment newInstance(StatFragmentVM.StatFragmentListener sfl){
        StatFragment sf = new StatFragment();
        sf.statFVM = new StatFragmentVM(sfl);
        return sf;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        sfbinding = DataBindingUtil.inflate(inflater, R.layout.stat_fragment, container, false);
        sfbinding.setStatFVM(statFVM);
        Picasso.with(sfbinding.getRoot().getContext()).
                load("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcR9zOC0Ba0pDr4DLWXLXDvhNKW9AU36szb7UTtn53JzrH_NdST6HWMMNw")
                .resize(100, 100)
                .into(sfbinding.userChangeButton);
        sfbinding.angryBar.setMax(PEOR);
        sfbinding.angryBar.setProgress(MAL);

        return sfbinding.getRoot();
    }
}
