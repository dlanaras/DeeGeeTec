package DeeGeeTec_Modul226a.Main.Models;

public class LocationJdbc extends Location {
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

    public LocationJdbc(String street, String plz, String streetNum, String place) {
        this.street = street;
        this.plz = plz;
        this.streetNum = streetNum;
        this.place = place;

        //... create new location in db
    }

    @Override
    public int getLocationId() { return this.locationId; }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String getPlz() {
        return plz;
    }

    @Override
    public void setPlz(String plz) {
        this.plz = plz;
    }

    @Override
    public String getStreetNum() {
        return streetNum;
    }

    @Override
    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    @Override
    public String getPlace() {
        return place;
    }

    @Override
    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        
    }

}
