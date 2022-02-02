package DeeGeeTec_Modul226a.Main.Factories;

import DeeGeeTec_Modul226a.Main.Models.*;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Account;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Address;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Cart;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Order;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.OrderDetails;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.ShipmentDetails;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Wishlist;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.AccountInMemory;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.AddressInMemory;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.CartInMemory;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.ItemInMemory;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.OrderDetailsInMemory;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.OrderInMemory;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.ShipmentDetailsInMemory;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.WishlistInMemory;

import javax.xml.stream.Location;
import java.util.ArrayList;

public class BackendInMemoryFactory extends BackendFactory {

    private static final BackendFactory factory = new BackendInMemoryFactory();
    public static BackendFactory getFactory() {
        return factory;
    }


    public Account createAccount() {
        return new AccountInMemory("", "", new AddressInMemory("", "", "", ""), "", "");
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
        return new OrderInMemory(new AccountInMemory("", "", new AddressInMemory("", "", "", "" ), "", ""), new ArrayList<>());
    }


    public OrderDetails createOrderDetails() {
        return new OrderDetailsInMemory("", new ArrayList<>());
    }


    public ShipmentDetails createShipmentDetails() {
        return new ShipmentDetailsInMemory("", new AddressInMemory("", "", "", ""),new OrderInMemory(new AccountInMemory("", "", new AddressInMemory("", "", "", "" ), "", ""), new ArrayList<>()));
    }

    public Wishlist createWishlist() {
        return new WishlistInMemory(new ArrayList<>());
    }

}
