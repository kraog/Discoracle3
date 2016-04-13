package eris.om.discoracle3.model;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Gorka on 11/04/2016.
 */@Module
public class User {

    private int id_user;
    private String icon_src;
    private String nombre;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getIcon_src() {
        return icon_src;
    }

    public void setIcon_src(String icon_src) {
        this.icon_src = icon_src;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Singleton
    @Provides
    public User newInstance(String nombre){
        User user = new User();
        user.setNombre(nombre);
        return user;
    };
}
