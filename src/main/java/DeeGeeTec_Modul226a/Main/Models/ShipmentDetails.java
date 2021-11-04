package DeeGeeTec_Modul226a.Main.Models;

public class ShipmentDetails {
    /**
     * This String contains the shipmentDetails
     */
    private String shipmentDetails;
    /**
     * This int contains the shipmentdetails ID
     */
    private int shipmentDetailsId;

    public void setShipmentDetailsId(int shipmentDetailsId) {
        this.shipmentDetailsId = shipmentDetailsId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * This contains the location of the shipmentdetails
     */
    private Location location;
    public int getShipmentDetailsId() { return this.shipmentDetailsId; }

    public String getShipmentDetails() {
        return shipmentDetails;
    }

    public void setShipmentDetails(String shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }
}
