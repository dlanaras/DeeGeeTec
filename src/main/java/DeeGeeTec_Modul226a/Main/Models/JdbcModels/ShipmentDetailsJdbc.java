package DeeGeeTec_Modul226a.Main.Models.JdbcModels;

import DeeGeeTec_Modul226a.Dbconfig.JdbcDb;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Address;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Order;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.ShipmentDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShipmentDetailsJdbc extends ShipmentDetails {
    /**
     * This String contains the shipmentDetails
     */
    private String shipmentDetails;
    /**
     * This int contains the shipmentdetails ID
     */
    private int shipmentDetailsId;

    private Address address;

    private int orderId;

    public ShipmentDetailsJdbc(String shipmentDetails, Address address, int orderId) {
        this.shipmentDetails = shipmentDetails;
        this.address = address;
        this.orderId = orderId;

        Connection conn = JdbcDb.getConnection();
        //adds the shipmentdetails to the db
        try {
            conn.setAutoCommit(false);

            PreparedStatement orderStatement = conn.prepareStatement("insert into shipmentdetails_tbl (order_IDFK, address_IDFK) values (?,?)");
            //has to be checked if works
            orderStatement.setInt(1, orderId);
            orderStatement.setInt(2, address.getAddressId());

            orderStatement.executeUpdate();
            conn.commit();
            conn.setAutoCommit(true);
        } catch(SQLException e) {
            System.out.printf("Error with account SQL statement %s", e);
        }
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public void setShipmentDetailsId(int shipmentDetailsId) {
        this.shipmentDetailsId = shipmentDetailsId;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public void setAddress(Address address) {
        this.address = address;
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
