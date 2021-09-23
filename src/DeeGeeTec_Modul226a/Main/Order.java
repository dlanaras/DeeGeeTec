package DeeGeeTec_Modul226a.Main;

import java.util.List;

public class Order {
    private String id;
    private Account account;
    private List<OrderDetails> orderDetails;
    private List<ShipmentDetails> shipmentDetails;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
