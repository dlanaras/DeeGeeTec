package DeeGeeTec_Modul226a.Main.Models;

import java.util.List;

public class OrderDetails {
    private int orderDetailsId;
    private String orderDetails;
    private List<Item> items;

    public int getOrderDetailsId() { return this.orderDetailsId; }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
