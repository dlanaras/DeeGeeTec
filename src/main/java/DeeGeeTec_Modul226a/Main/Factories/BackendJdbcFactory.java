package DeeGeeTec_Modul226a.Main.Factories;

import DeeGeeTec_Modul226a.Main.Models.*;

import java.util.ArrayList;

public class BackendJdbcFactory extends BackendFactory {
    private static final BackendFactory factory=new BackendJdbcFactory();
    public static BackendFactory getFactory() {
        return factory;
    }


    public Account createAccount() {
        return new AccountJdbc("", "", new LocationJdbc("", "", "", ""));
    }


    public Cart createCart() {
        return new CartJdbc(new ArrayList<>());
    }


    public Item createItem() {
        return new ItemJdbc("", 2);
    }


    public Location createLocation() {
        return new LocationJdbc("", "", "", "");
    }


    public Order createOrder() {
        return new OrderJdbc(new AccountJdbc("", "", new LocationJdbc("", "", "", "")), new ArrayList<>(), new ShipmentDetailsJdbc("", new LocationJdbc("","","","")));
    }


    public OrderDetails createOrderDetails() {
        return new OrderDetailsJdbc("", new ArrayList<>());
    }


    public ShipmentDetails creaShipmentDetails() {
        return new ShipmentDetailsJdbc("", new LocationJdbc("","","",""));
    }

    public Wishlist createWishlist() {
        return new WishlistJdbc(new ArrayList<>());
    }
}
