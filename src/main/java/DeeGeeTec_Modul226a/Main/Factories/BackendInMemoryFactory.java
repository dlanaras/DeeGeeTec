package DeeGeeTec_Modul226a.Main.Factories;

import DeeGeeTec_Modul226a.Main.Models.*;

import java.util.ArrayList;

public class BackendInMemoryFactory extends BackendFactory {

    private static final BackendFactory factory = new BackendInMemoryFactory();
    public static BackendFactory getFactory() {
        return factory;
    }


    public Account createAccount() {
        return new AccountInMemory("", "", new LocationInMemory("", "", "", ""));
    }


    public Cart createCart() {
        return new CartInMemory(new ArrayList<>());
    }


    public Item createItem() {
        return new ItemInMemory("", 2);
    }


    public Location createLocation() {
        return new LocationInMemory("", "", "", "");
    }


    public Order createOrder() {
        return new OrderInMemory(new AccountInMemory("", "", new LocationInMemory("", "", "", "")), new ArrayList<>(), new ShipmentDetailsInMemory("", new LocationInMemory("","","","")));
    }


    public OrderDetails createOrderDetails() {
        return new OrderDetailsInMemory("", new ArrayList<>());
    }


    public ShipmentDetails creaShipmentDetails() {
        return new ShipmentDetailsInMemory("", new LocationInMemory("","","",""));
    }

    public Wishlist createWishlist() {
        return new WishlistInMemory(new ArrayList<>());
    }

}
