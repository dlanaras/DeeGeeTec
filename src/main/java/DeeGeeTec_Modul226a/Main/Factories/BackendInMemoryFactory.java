package DeeGeeTec_Modul226a.Main.Factories;

import DeeGeeTec_Modul226a.Main.Models.Account;
import DeeGeeTec_Modul226a.Main.Models.Cart;
import DeeGeeTec_Modul226a.Main.Models.Item;
import DeeGeeTec_Modul226a.Main.Models.Location;
import DeeGeeTec_Modul226a.Main.Models.Order;
import DeeGeeTec_Modul226a.Main.Models.OrderDetails;
import DeeGeeTec_Modul226a.Main.Models.ShipmentDetails;
import DeeGeeTec_Modul226a.Main.Models.Wishlist;

public class BackendInMemoryFactory implements BackendFactory {

    @Override
    public Account createAccount() {

    }

    @Override
    public Cart createCart() {

    }

    @Override
    public Item createItem() {

    }

    @Override
    public Location createLocation() {

    }

    @Override
    public Order createOrder() {

    }

    @Override
    public OrderDetails createOrderDetails() {

    }

    @Override
    public ShipmentDetails creaShipmentDetails() {

    }

    @Override
    public Wishlist createWishlist() {

    }

    @Override
    public BackendFactory getFactory() {
        return this;
    }
    
}
