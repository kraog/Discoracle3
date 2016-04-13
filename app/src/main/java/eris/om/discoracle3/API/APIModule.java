package eris.om.discoracle3.API;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Gorka on 12/04/2016.
 */
@Module
public class APIModule {

    @Singleton
    @Provides
    QuantumNumberAPI getQuantumNumberAPI(){
        return QuantumNumberService.newAPIinstance();
    }
}
