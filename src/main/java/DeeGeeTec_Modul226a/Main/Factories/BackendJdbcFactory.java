package DeeGeeTec_Modul226a.Main.Factories;

import java.util.ArrayList;
import java.util.List;

import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Account;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Address;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Cart;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Order;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.OrderDetails;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.ShipmentDetails;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Wishlist;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.CartInMemory;
import DeeGeeTec_Modul226a.Main.Models.JdbcModels.AccountJdbc;
import DeeGeeTec_Modul226a.Main.Models.JdbcModels.AddressJdbc;
import DeeGeeTec_Modul226a.Main.Models.JdbcModels.ItemJdbc;
import DeeGeeTec_Modul226a.Main.Models.JdbcModels.OrderDetailsJdbc;
import DeeGeeTec_Modul226a.Main.Models.JdbcModels.OrderJdbc;
import DeeGeeTec_Modul226a.Main.Models.JdbcModels.ShipmentDetailsJdbc;
import DeeGeeTec_Modul226a.Main.Models.JdbcModels.WishlistJdbc;

public class BackendJdbcFactory extends BackendFactory {
    private static final BackendFactory factory=new BackendJdbcFactory();

    public static BackendFactory getFactory() {
        return factory;
    }

    @Override
    public Account createAccount(String username, String password, Address address, String email, String firstName, String lastName) {

        return new AccountJdbc(username, password, address, email, firstName, lastName);
    }

    @Override
    public Cart createCart(List<Item> items) {

        return new CartInMemory(items);
    }

    @Override
    public Item createItem(String itemName, float price) {

        return new ItemJdbc(itemName, price);
    }

    @Override
    public Address createAddress(String street, String plz, String streetNum, String place) {

        return new AddressJdbc(street, plz, streetNum, place);
    }

    @Override
    public Order createOrder(Account account, List<OrderDetails> orderDetails) {

        return new OrderJdbc(account, orderDetails);
    }

    @Override
    public OrderDetails createOrderDetails(String orderDetails, List<Item> items) {

        return new OrderDetailsJdbc(orderDetails, items);
    }

    @Override
    public ShipmentDetails createShipmentDetails(String shipmentDetails, Address address, Order orderId) {

        return new ShipmentDetailsJdbc(shipmentDetails, address, orderId);
    }

    @Override
    public Wishlist createWishlist(List<Item> wishlistItems) {

        return new WishlistJdbc(wishlistItems);
    }



}
