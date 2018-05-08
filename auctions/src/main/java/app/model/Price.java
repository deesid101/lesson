package app.model;

import java.time.LocalDate;

public class Price {
    private String id;
    private String value;
    private String auctionTime;
    private String auctionName;



    public Price(String value, String auctionTime, String auctionName) {
        setId(id);
        this.value = value;
        this.auctionTime = auctionTime;
        this.auctionName = auctionName;
    }

    public String getvalue() {
        return value;
    }

    public void setauctionTime(String auctionTime) {
        this.auctionTime = auctionTime;
    }

    public String getauctionName() {
        return auctionName;
    }

    public void setauctionName(String auctionName) {
        this.auctionName = auctionName;
    }



    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String toString(){
        return "I am pricing  "  + value + " and my start auction time is  " + auctionTime  + " and the auction name  is  "  + auctionName + " So place the bid !!! Thank you"  ;
    }
}

