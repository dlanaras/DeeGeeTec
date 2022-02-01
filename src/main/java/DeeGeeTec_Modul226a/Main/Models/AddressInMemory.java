package DeeGeeTec_Modul226a.Main.Models;

import java.util.ArrayList;

public class AddressInMemory extends Address {

    private static final ArrayList<AddressInMemory> locations = new ArrayList<>();

    private String street;
    private String plz;
    private String streetNum;
    private String place;
    private int locationId;

    public AddressInMemory(String street, String plz, String streetNum, String place) {
        this.street = street;
        this.plz = plz;
        this.streetNum = streetNum;
        this.place = place;
        locations.add(this);
    }

    @Override
    public int getLocationId() {
        return this.locationId;
    }

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
        locations.remove(this);
    }

}