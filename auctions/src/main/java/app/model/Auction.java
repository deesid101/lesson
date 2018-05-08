package app.model;

import java.time.LocalDate;

public class Auction {
    private String id;
    private String startDate;
    private String endDate;
    private String name;

    public Auction(String startDate, String endDate, String name) {
        setId(name);
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String toString(){
        return "I am an Auction called "  + name + " and my start date is  " + startDate + " and the end date "  + endDate + " So Please bid on " + id + " Thank you"  ;
    }
}
