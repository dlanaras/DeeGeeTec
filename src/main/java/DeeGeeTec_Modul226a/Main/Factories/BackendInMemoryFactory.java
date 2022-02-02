package DeeGeeTec_Modul226a.Main.Factories;

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
import java.util.List;

public class BackendInMemoryFactory extends BackendFactory {

    private static final BackendFactory factory = new BackendInMemoryFactory();
    public static BackendFactory getFactory() {
        return factory;
    }

    @Override
    public Account createAccount(String username, String password, Address address, String email, String firstName, String lastName) {

        return new AccountInMemory(username, password, address, email, firstName, lastName);
    }
    @Override
    public Cart createCart(List<Item> items) {

        return new CartInMemory(items);
    }
    @Override
    public Item createItem(String itemName, float price) {

        return new ItemInMemory(itemName, price);
    }
    @Override
    public Address createAddress(String street, String plz, String streetNum, String place) {

        return new AddressInMemory(street, plz, streetNum, place);
    }
    @Override
    public Order createOrder(Account account, List<OrderDetails> orderDetails) {

        return new OrderInMemory(account, orderDetails);
    }
    @Override
    public OrderDetails createOrderDetails(String orderDetails, List<Item> items) {

        return new OrderDetailsInMemory(orderDetails, items);
    }
    @Override
    public ShipmentDetails createShipmentDetails(String shipmentDetails, Address address, Order orderId) {
 
        return new ShipmentDetailsInMemory(shipmentDetails, address, orderId);
    }
    @Override
    public Wishlist createWishlist(List<Item> wishlistItems) {
 
        return new WishlistInMemory(wishlistItems);
    }


    

}
