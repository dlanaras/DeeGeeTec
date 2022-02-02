package DeeGeeTec_Modul226a.Main.Models.AbstractModels;

public abstract class ShipmentDetails {

    public abstract void setShipmentDetailsId(int shipmentDetailsId);

    public abstract Address getLocation();

    public abstract void setLocation(Address location);

    public abstract int getShipmentDetailsId();

    public abstract String getShipmentDetails();

    public abstract void setShipmentDetails(String shipmentDetails);

    public abstract void delete();
}
