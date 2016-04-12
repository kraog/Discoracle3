package eris.om.discoracle3.API;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by Gorka on 12/04/2016.
 */
public class QuantumNumberService {
    private final QuantumNumberAPI qnAPI;
    private QuantumNumberService(){
        String api = "https://qrng.anu.edu.au/API/";
        Retrofit retro = new Retrofit
                .Builder()
                .baseUrl(api)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        qnAPI = retro.create(QuantumNumberAPI.class);
    }
    public static QuantumNumberAPI newAPIinstance(){
        return new QuantumNumberService().qnAPI;
    }
}
