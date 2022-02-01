package DeeGeeTec_Modul226a.Main.Models;

import java.util.List;

public class OrderJdbc extends Order {
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

    public OrderJdbc(Account account, List<OrderDetails> orderDetails, ShipmentDetails shipmentDetails) {
        this.account = account;
        this.orderDetails = orderDetails;
        this.shipmentDetails = shipmentDetails;

        //... add it to db
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
        
        
    }

}
