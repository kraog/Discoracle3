package eris.om.discoracle3.model;

import java.util.Date;

/**
 * Created by Gorka on 11/04/2016.
 */
public class Tip {
    private int id;
    private Date tip_date;
    private String sentence;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTip_date() {
        return tip_date;
    }

    public void setTip_date(Date tip_date) {
        this.tip_date = tip_date;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
