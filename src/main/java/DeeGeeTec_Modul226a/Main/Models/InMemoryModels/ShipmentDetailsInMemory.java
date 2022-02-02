package DeeGeeTec_Modul226a.Main.Models.InMemoryModels;

import java.util.ArrayList;

import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Address;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Order;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.ShipmentDetails;

public class ShipmentDetailsInMemory extends ShipmentDetails {
    private static final ArrayList<ShipmentDetails> shipmentDetailsObjects = new ArrayList<>();
    private Order orderId;
    private String shipmentDetails;
    private static int shipmentDetailsId;
    private Address location;

    public ShipmentDetailsInMemory(String shipmentDetails, Address location, Order orderId) {
        this.shipmentDetails = shipmentDetails;
        this.location = location;
        this.orderId = orderId;
        shipmentDetailsObjects.add(this);
        shipmentDetailsId++;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    @Override
    public Address getLocation() {
        return location;
    }

    @Override
    public void setLocation(Address location) {
        this.location = location;
    }
    
    @Override
    public int getShipmentDetailsId() {
        return shipmentDetailsId;
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

    @Override
    public void setShipmentDetailsId(int shipmentDetailsId) {
        shipmentDetailsObjects.remove(this);
    }
}
