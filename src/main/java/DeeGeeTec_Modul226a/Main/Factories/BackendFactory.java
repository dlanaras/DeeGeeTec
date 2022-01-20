package DeeGeeTec_Modul226a.Main.Factories;

import DeeGeeTec_Modul226a.Main.Models.Account;
import DeeGeeTec_Modul226a.Main.Models.Cart;
import DeeGeeTec_Modul226a.Main.Models.Item;
import DeeGeeTec_Modul226a.Main.Models.Location;
import DeeGeeTec_Modul226a.Main.Models.Order;
import DeeGeeTec_Modul226a.Main.Models.OrderDetails;
import DeeGeeTec_Modul226a.Main.Models.ShipmentDetails;
import DeeGeeTec_Modul226a.Main.Models.Wishlist;

public abstract class BackendFactory {
    Account createAccount() {

    }

    Cart createCart() {

    }
    Item createItem() {

    }
    Location createLocation() {

    }
    Order createOrder() {

    }
    OrderDetails createOrderDetails() {

    }
    ShipmentDetails creaShipmentDetails() {

    }
    Wishlist createWishlist() {

    }
    public static BackendFactory getFactory() {
        if()
    }
}