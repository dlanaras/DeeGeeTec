package DeeGeeTec_Modul226a.Main.Models.JdbcModels;

import java.util.List;

import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.OrderDetails;

public class OrderDetailsJdbc extends OrderDetails {
      /**
     * This contains the ID of the orderdetails
     */
    private int orderDetailsId;
    /**
     * This String contains the orderDetails
     */
    private String orderDetails;
    /**
     * This List contains all items of the orderdetails
     */
    private List<Item> items;

    public OrderDetailsJdbc(String orderDetails, List<Item> items) {
        this.orderDetails = orderDetails;
        this.items = items;

        //... add it to 
    }

    @Override
    public int getOrderDetailsId() {
        return this.orderDetailsId;
    }

    @Override
    public String getOrderDetails() {
        return orderDetails;
    }

    @Override
    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public List<Item> getItems() {
        return items;
    }

    @Override
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        
    }

}
