package shita.data.model;

import java.time.LocalDate;

public class Event {
    private  int id;
    LocalDate When;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getWhen() {
        return When;
    }

    public void setWhen(LocalDate when) {
        When = when;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    private  String  who;
    private  String what;
}
