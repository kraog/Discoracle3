package eris.om.discoracle3.model;

import java.util.List;

/**
 * Created by Gorka on 12/04/2016.
 */
public class Quanto {
    private String datatype;
    private int list_length;
    private boolean success;
    private List<Integer> lista;

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public int getList_length() {
        return list_length;
    }

    public void setList_length(int list_length) {
        this.list_length = list_length;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }
}
