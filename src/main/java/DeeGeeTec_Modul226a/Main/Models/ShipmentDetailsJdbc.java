package DeeGeeTec_Modul226a.Main.Models;

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
    
    public ShipmentDetailsJdbc(String shipmentDetails, Address location) {
        this.shipmentDetails = shipmentDetails;
        this.location = location;

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
