package DeeGeeTec_Modul226a.Main.Factories;

import DeeGeeTec_Modul226a.Main.Models.*;

import java.util.ArrayList;

public class BackendInMemoryFactory extends BackendFactory {

    private static final BackendFactory factory = new BackendInMemoryFactory();
    public static BackendFactory getFactory() {
        return factory;
    }


    public Account createAccount() {
        return new AccountInMemory("", "", new AddressInMemory("", "", "", ""));
    }


    public Cart createCart() {
        return new CartInMemory(new ArrayList<>());
    }


    public Item createItem() {
        return new ItemInMemory("", 2);
    }


    public Address createLocation() {
        return new AddressInMemory("", "", "", "");
    }


    public Order createOrder() {
        return new OrderInMemory(new AccountInMemory("", "", new AddressInMemory("", "", "", "")), new ArrayList<>(), new ShipmentDetailsInMemory("", new AddressInMemory("","","","")));
    }


    public OrderDetails createOrderDetails() {
        return new OrderDetailsInMemory("", new ArrayList<>());
    }


    public ShipmentDetails creaShipmentDetails() {
        return new ShipmentDetailsInMemory("", new AddressInMemory("","","",""));
    }

    public Wishlist createWishlist() {
        return new WishlistInMemory(new ArrayList<>());
    }

}
