package DeeGeeTec_Modul226a.Main.Models;

import java.util.List;

public class Order {
    private int orderId;
    private Account account;
    private List<OrderDetails> orderDetails;
    private List<ShipmentDetails> shipmentDetails;

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

    public List<ShipmentDetails> getShipmentDetails() {
        return shipmentDetails;
    }

    public void setShipmentDetails(List<ShipmentDetails> shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }

}
