package eris.om.discoracle3.model;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Gorka on 12/04/2016.
 */
@Module
public class Estado {

    public static enum Estado_desc {Bien,Mal,Horrible};
    private Estado_desc estado_desc;

    public Estado_desc getEstado_desc() {
        return estado_desc;
    }

    public void setEstado_desc(Estado_desc estado_desc) {
        this.estado_desc = estado_desc;
    }

    @Singleton
    @Provides
    public Estado newInstance(){
        return new Estado();
    }
}
