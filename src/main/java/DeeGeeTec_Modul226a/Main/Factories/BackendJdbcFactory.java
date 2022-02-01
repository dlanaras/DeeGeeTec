package DeeGeeTec_Modul226a.Main.Factories;

import DeeGeeTec_Modul226a.Main.Models.*;

import java.util.ArrayList;

public class BackendJdbcFactory extends BackendFactory {
    private static final BackendFactory factory=new BackendJdbcFactory();
    public static BackendFactory getFactory() {
        return factory;
    }


    public Account createAccount() {
        return new AccountJdbc("", "", new AddressJdbc("", "", "", ""));
    }


    public Cart createCart() {
        // Always inMemory because DB doesnt have a table for this, because this should be only temporarely saved
        return new CartInMemory(new ArrayList<>());
    }


    public Item createItem() {
        return new ItemJdbc("", 2);
    }


    public Address createLocation() {
        return new AddressJdbc("", "", "", "");
    }


    public Order createOrder() {
        return new OrderJdbc(new AccountJdbc("", "", new AddressJdbc("", "", "", "")), new ArrayList<>(), new ShipmentDetailsJdbc("", new AddressJdbc("","","","")));
    }


    public OrderDetails createOrderDetails() {
        return new OrderDetailsJdbc("", new ArrayList<>());
    }


    public ShipmentDetails creaShipmentDetails() {
        return new ShipmentDetailsJdbc("", new AddressJdbc("","","",""));
    }

    public Wishlist createWishlist() {
        return new WishlistJdbc(new ArrayList<>());
    }
}
