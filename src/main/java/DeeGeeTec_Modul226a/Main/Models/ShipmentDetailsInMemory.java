package DeeGeeTec_Modul226a.Main.Models;

import java.util.ArrayList;

public class ShipmentDetailsInMemory extends ShipmentDetails {
    private static final ArrayList<ShipmentDetails> shipmentDetailsObjects = new ArrayList<>();

    private String shipmentDetails;
    private int shipmentDetailsId;
    private Location location;

    public ShipmentDetailsInMemory(String shipmentDetails, Location location) {
        this.shipmentDetails = shipmentDetails;
        this.location = location;

        shipmentDetailsObjects.add(this);
    }

    @Override
    public void setShipmentDetailsId(int shipmentDetailsId) {
        this.shipmentDetailsId = shipmentDetailsId;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }
    
    @Override
    public int getShipmentDetailsId() {
        return this.shipmentDetailsId;
    }

    @Override
    public String getShipmentDetails() {
        return shipmentDetails;
    }

    @Override
    public void setShipmentDetails(String shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }

    @Override
    public void delete() {
        shipmentDetailsObjects.remove(this);        
    }
}
