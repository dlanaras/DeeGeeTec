package DeeGeeTec_Modul226a.Main.Models.AbstractModels;

import java.util.List;

public abstract class Order {

    public abstract int getOrderId();

    public abstract Account getAccount();

    public abstract void setAccount(Account account);

    public abstract List<OrderDetails> getOrderDetails();

    public abstract void setOrderDetails(List<OrderDetails> orderDetails);

    public abstract void delete();
}
