package DeeGeeTec_Modul226a.Main.Models;

public abstract class Location {

    public abstract int getLocationId();

    public abstract String getStreet();

    public abstract void setStreet(String street);

    public abstract String getPlz();

    public abstract void setPlz(String plz);

    public abstract String getStreetNum();

    public abstract void setStreetNum(String streetNum);

    public abstract String getPlace();

    public abstract void setPlace(String place);

    public abstract void delete();

}
