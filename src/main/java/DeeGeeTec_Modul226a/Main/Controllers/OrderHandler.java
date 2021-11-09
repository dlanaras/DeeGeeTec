package DeeGeeTec_Modul226a.Main.Controllers;

import DeeGeeTec_Modul226a.Main.Models.Account;
import DeeGeeTec_Modul226a.Main.Models.Order;
import DeeGeeTec_Modul226a.Main.Models.OrderDetails;
import DeeGeeTec_Modul226a.Main.Models.ShipmentDetails;

import java.util.ArrayList;
import java.util.List;
/**
 * This is the controller that handles everything that has to do with the order.
 *
 * @author Sven, Dimitrios, Arman
 * @version 2.0
 */
public class OrderHandler {
    /**
     * Creates a order according to the shoppingcart and details of the user in the db
     */
    public void CreateOrder() {
        /*

        //shipment and order details should be created inserted into db
        //and then the order should be inserted into account with the fks of the newly created details
        */
        Account currentUser = AccountHandler.getCurrentUser();
        Order orderToBeCreated = new Order();
        orderToBeCreated.setOrderDetails(new ArrayList<OrderDetails>());
        orderToBeCreated.setShipmentDetails(new ShipmentDetails());

    }

    /**
     * @param orderId ID of the order to be retrieved
     * @return returns the specific order of an account with the provided orderID
     */
    public Order GetSpecificOrder(int orderId) {
        //return a specific order from logged in user using orderId
        Account currentUser = AccountHandler.getCurrentUser();
        return new Order();
    }

    /**
     * @return returns a arraylist with all orders of a account
     */
    public List<Order> GetAllOrders() {
        //get all orders of this user using an SQL query and return them
        Account currentUser = AccountHandler.getCurrentUser();
        return new ArrayList<Order>();
    }
}
