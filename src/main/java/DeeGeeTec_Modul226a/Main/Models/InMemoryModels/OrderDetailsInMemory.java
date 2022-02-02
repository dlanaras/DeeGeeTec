package DeeGeeTec_Modul226a.Main.Models.InMemoryModels;

import java.util.ArrayList;
import java.util.List;

import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.OrderDetails;

public class OrderDetailsInMemory extends OrderDetails {
    private static final ArrayList<OrderDetailsInMemory> orderDetailsObjects = new ArrayList<>();

    private static int orderDetailsId;
    private String orderDetails;
    private List<Item> items;

    public OrderDetailsInMemory(String orderDetails, List<Item> items) {
        this.orderDetails = orderDetails;
        this.items = items;

        orderDetailsObjects.add(this);
        orderDetailsId++;
    }

    @Override
    public int getOrderDetailsId() {
        return orderDetailsId;
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
        orderDetailsObjects.remove(this);
        
    }

}
