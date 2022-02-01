package DeeGeeTec_Modul226a.Main.Factories;

import DeeGeeTec_Modul226a.Main.Models.Account;
import DeeGeeTec_Modul226a.Main.Models.Cart;
import DeeGeeTec_Modul226a.Main.Models.Item;
import DeeGeeTec_Modul226a.Main.Models.Location;
import DeeGeeTec_Modul226a.Main.Models.Order;
import DeeGeeTec_Modul226a.Main.Models.OrderDetails;
import DeeGeeTec_Modul226a.Main.Models.ShipmentDetails;
import DeeGeeTec_Modul226a.Main.Models.Wishlist;

public class BackendInMemoryFactory extends BackendFactory {

    private static final BackendFactory factory = new BackendInMemoryFactory();
    public static BackendFactory getFactory() {
        return factory;
    }


    public Account createAccount() {
        return new Account();
    }


    public Cart createCart() {
        return new Cart();
    }


    public Item createItem() {
        return new Item();
    }


    public Location createLocation() {
        return new Location();
    }


    public Order createOrder() {
        return new Order();
    }


    public OrderDetails createOrderDetails() {
        return new OrderDetails();
    }


    public ShipmentDetails creaShipmentDetails() {
        return new ShipmentDetails();
    }

    public Wishlist createWishlist() {
        return new Wishlist();
    }
    
}
