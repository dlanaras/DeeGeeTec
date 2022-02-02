package DeeGeeTec_Modul226a.Main.Models.AbstractModels;

public abstract class ShipmentDetails {

    public abstract void setShipmentDetailsId(int shipmentDetailsId);

    public abstract Address getAddress();

    public abstract void setAddress(Address address);

    public abstract int getShipmentDetailsId();

    public abstract String getShipmentDetails();

    public abstract void setShipmentDetails(String shipmentDetails);

    public abstract void delete();
}
