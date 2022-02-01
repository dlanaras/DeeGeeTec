package DeeGeeTec_Modul226a.Main.Models;

import java.util.List;

public abstract class OrderDetails {

    public abstract int getOrderDetailsId();

    public abstract String getOrderDetails();

    public abstract void setOrderDetails(String orderDetails);

    public abstract List<Item> getItems();

    public abstract void setItems(List<Item> items);

    public abstract void delete();
}
