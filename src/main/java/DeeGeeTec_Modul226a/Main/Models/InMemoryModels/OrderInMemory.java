package DeeGeeTec_Modul226a.Main.Models.InMemoryModels;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Account;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Order;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.OrderDetails;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.ShipmentDetails;

public class OrderInMemory extends Order {

    private static final ArrayList<OrderInMemory> orders = new ArrayList<>();

    private static int orderId;
    private Account account;
    private List<OrderDetails> orderDetails;
    private Date date = new Date();

    public OrderInMemory(Account account, List<OrderDetails> orderDetails) {
        this.account = account;
        this.orderDetails = orderDetails;
        this.setDate(Calendar.getInstance().getTime());
        orders.add(this);
        orderId++;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int getOrderId() {
        return orderId;
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
    public void delete() {
        orders.remove(this);
    }

}
