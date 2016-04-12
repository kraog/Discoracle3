package eris.om.discoracle3.API;

import eris.om.discoracle3.model.Quanto;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by Gorka on 12/04/2016.
 */
public interface QuantumNumberAPI {

    @GET("jsonI.php?")
    Observable<Quanto> getRandomNumbers(@Query("length") int list_length, @Query("type") String tipo);
}
