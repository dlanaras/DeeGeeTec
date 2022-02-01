package DeeGeeTec_Modul226a.Main.Models;

import java.util.ArrayList;
import java.util.List;

public class OrderInMemory extends Order {

    private static final ArrayList<OrderInMemory> orders = new ArrayList<>();

    private int orderId;
    private Account account;
    private List<OrderDetails> orderDetails;
    private ShipmentDetails shipmentDetails;

    public OrderInMemory(Account account, List<OrderDetails> orderDetails, ShipmentDetails shipmentDetails) {
        this.account = account;
        this.orderDetails = orderDetails;
        this.shipmentDetails = shipmentDetails;
        orders.add(this);
    }

    @Override
    public int getOrderId() {
        return this.orderId;
    }

    @Override
    public Account getAccount() {
        return account;
    }

    @Override
    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    @Override
    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public ShipmentDetails getShipmentDetails() {
        return shipmentDetails;
    }

    @Override
    public void setShipmentDetails(ShipmentDetails shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }

    @Override
    public void delete() {
        orders.remove(this);
    }

}
