package DeeGeeTec_Modul226a.Main.Models;

public class Location {
    /**
     * This String contains the street of a location
     */
    private String street;
    /**
     * This String contains the PLZ of a location
     */
    private String plz;
    /**
     * This String contains the streetnumber of a location
     */
    private String streetNum;
    /**
     * This String contains the place of a location
     */
    private String place;
    /**
     * This int contains the ID of a location
     */
    private int locationId;

    public int getLocationId() { return this.locationId; }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

}
