package DeeGeeTec_Modul226a.Main.Models;

import java.util.List;

public class Order {
    /**
     * This int contains the ID of the order
     */
    private int orderId;
    /**
     * This contains the account of the logged in user
     */
    private Account account;
    /**
     * This contains a list with all ordered items of a order
     */
    private List<OrderDetails> orderDetails;
    /**
     * this contains the shipmentdetails of a order
     */
    private ShipmentDetails shipmentDetails;

    public int getOrderId() {
        return this.orderId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public ShipmentDetails getShipmentDetails() {
        return shipmentDetails;
    }

    public void setShipmentDetails(ShipmentDetails shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }

}
