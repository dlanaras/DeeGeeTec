package DeeGeeTec_Modul226a.Main.Factories;

import java.util.List;

import DeeGeeTec_Modul226a.HibernationType;
import DeeGeeTec_Modul226a.Dbconfig.Configuration;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Account;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Address;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Cart;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Order;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.OrderDetails;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.ShipmentDetails;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Wishlist;

public abstract class BackendFactory {

    public abstract Account createAccount(String userName, String password, Address address, String email, String firstName, String lastName);
    public abstract Cart createCart(List<Item> items);
    public abstract Item createItem(String itemName, float price);
    public abstract Address createAddress(String street, String plz, String streetNum, String place);
    public abstract Order createOrder(Account account, List<OrderDetails> orderDetails);
    public abstract OrderDetails createOrderDetails(String orderDetails, List<Item> items);
    public abstract ShipmentDetails createShipmentDetails(String shipmentDetails, Address address, Order orderId);
    public abstract Wishlist createWishlist(List<Item> wishlistItems); //@sven the constructor should still accept a list of items in case we want to instantly fill the wishlist


    public static BackendFactory getFactory() {
        if(Configuration.hibernation == HibernationType.inMemory) {
            return BackendInMemoryFactory.getFactory();
        } else if (Configuration.hibernation == HibernationType.jdbc) {
            return BackendJdbcFactory.getFactory();
        }
        throw new RuntimeException(Configuration.hibernation + " not implemented yet");
    }
}