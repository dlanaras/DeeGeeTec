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


    public Account createAccount() {
        return new AccountJdbc("", "", new AddressJdbc("", "", "", ""), "", "", "");
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
        return new OrderJdbc(new AccountJdbc("", "", new AddressJdbc("", "", "", ""), "", "", ""), new ArrayList<>());
    }


    public OrderDetails createOrderDetails() {
        return new OrderDetailsJdbc("", new ArrayList<>());
    }


    public ShipmentDetails createShipmentDetails() {
        return new ShipmentDetailsJdbc("", new AddressJdbc("", "", "", ""), new OrderJdbc(new AccountJdbc("", "", new AddressJdbc("", "", "", ""), "", "", ""), new ArrayList<>()) {
            @Override
            public int getOrderId() {
                return 0;
            }

            @Override
            public Account getAccount() {
                return null;
            }

            @Override
            public void setAccount(Account account) {

            }

            @Override
            public List<OrderDetails> getOrderDetails() {
                return null;
            }

            @Override
            public void setOrderDetails(List<OrderDetails> orderDetails) {

            }

            @Override
            public void delete() {

            }
        });
    }

    public Wishlist createWishlist() {
        return new WishlistJdbc(new AccountJdbc("", "", new AddressJdbc("", "", "", ""), "", "", ""));
    }
}
