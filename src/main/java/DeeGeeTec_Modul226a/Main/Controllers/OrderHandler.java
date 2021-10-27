package DeeGeeTec_Modul226a.Main.Controllers;

import DeeGeeTec_Modul226a.Main.Models.Account;
import DeeGeeTec_Modul226a.Main.Models.Order;
import DeeGeeTec_Modul226a.Main.Models.OrderDetails;
import DeeGeeTec_Modul226a.Main.Models.ShipmentDetails;

import java.util.ArrayList;
import java.util.List;

public class OrderHandler {
    public void CreateOrder() {
        /*

        //shipment and order details should be created inserted into db
        //and then the order should be inserted into account with the fks of the newly created details
        */
        Account currentUser = AccountHandler.getCurrentUser();
        Order orderToBeCreated = new Order();
        orderToBeCreated.setOrderDetails(new ArrayList<OrderDetails>());
        orderToBeCreated.setShipmentDetails(new ArrayList<ShipmentDetails>());

    }

    public Order GetSpecificOrder(int orderId) {
        //return a specific order from logged in user using orderId
        Account currentUser = AccountHandler.getCurrentUser();
        return new Order();
    }

    public List<Order> GetAllOrders() {
        //get all orders of this user using an SQL query and return them
        Account currentUser = AccountHandler.getCurrentUser();
        return new ArrayList<Order>();
    }
}
