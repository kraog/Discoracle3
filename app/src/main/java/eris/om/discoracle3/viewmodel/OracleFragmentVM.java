package eris.om.discoracle3.viewmodel;

import android.databinding.ObservableField;
import android.view.View;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by Gorka on 11/04/2016.
 */
public class OracleFragmentVM {
    public OracleFragmentListener mOracleFragmentListener;
    public ObservableField<String> oraculoText;

    public OracleFragmentVM(OracleFragmentListener ofl){
        this.mOracleFragmentListener = ofl;
        this.oraculoText = new ObservableField<String>();
    }
    public interface OracleFragmentListener {
        public void onOracleTextEntered();
    }

    public void onOracleTextEnter(View view){
        mOracleFragmentListener.onOracleTextEntered();
    }

    public void onOracleAsked(String question){
        oraculoText.set("Mmhhhh...");
        Observable.just("como osas a decir: " + question)
                .delay(4, TimeUnit.SECONDS)
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(String s) {
                        oraculoText.set(s);
                    }
                });
    }

}
