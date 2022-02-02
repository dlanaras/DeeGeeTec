package DeeGeeTec_Modul226a.Main.Models.InMemoryModels;

import java.util.ArrayList;

import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Address;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Order;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.ShipmentDetails;

public class ShipmentDetailsInMemory extends ShipmentDetails {
    private static final ArrayList<ShipmentDetails> shipmentDetailsObjects = new ArrayList<>();
    private int orderId;
    private String shipmentDetails;
    private static int shipmentDetailsId;
    private Address address;

    public ShipmentDetailsInMemory(String shipmentDetails, Address address, int orderId) {
        this.shipmentDetails = shipmentDetails;
        this.address = address;
        this.orderId = orderId;
        shipmentDetailsObjects.add(this);
        shipmentDetailsId++;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public void setAddress(Address address) {
        this.address = address;
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
