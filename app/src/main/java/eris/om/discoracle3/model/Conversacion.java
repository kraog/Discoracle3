package eris.om.discoracle3.model;

import java.util.List;

/**
 * Created by Gorka on 11/04/2016.
 */
public class Conversacion {

    private int id;
    private List<Tip> listaTip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Tip> getListaTip() {
        return listaTip;
    }

    public void setListaTip(List<Tip> listaTip) {
        this.listaTip = listaTip;
    }
}
