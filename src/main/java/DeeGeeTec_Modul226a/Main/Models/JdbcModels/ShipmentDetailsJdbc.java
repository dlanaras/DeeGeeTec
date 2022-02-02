package DeeGeeTec_Modul226a.Main.Models.JdbcModels;

import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Address;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Order;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.ShipmentDetails;

public class ShipmentDetailsJdbc extends ShipmentDetails {
    /**
     * This String contains the shipmentDetails
     */
    private String shipmentDetails;
    /**
     * This int contains the shipmentdetails ID
     */
    private int shipmentDetailsId;

    private Address location;
    private Order order;

    public ShipmentDetailsJdbc(String shipmentDetails, Address location, Order order) {
        this.shipmentDetails = shipmentDetails;
        this.location = location;
        this.order = order;
        //... add this to db
    }

    @Override
    public void setShipmentDetailsId(int shipmentDetailsId) {
        this.shipmentDetailsId = shipmentDetailsId;
    }

    @Override
    public Address getLocation() {
        return location;
    }

    @Override
    public void setLocation(Address location) {
        this.location = location;
    }

    /**
     * This contains the location of the shipmentdetails
     */

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
        // TODO Auto-generated method stub
        
    }
}
