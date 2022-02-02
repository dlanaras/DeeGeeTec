package DeeGeeTec_Modul226a.Main.Factories;

import DeeGeeTec_Modul226a.HibernationType;
import DeeGeeTec_Modul226a.Dbconfig.Configuration;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Account;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Address;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Cart;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Order;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.OrderDetails;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.ShipmentDetails;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Wishlist;

public abstract class BackendFactory {

    public abstract Account createAccount();
    public abstract Cart createCart();
    public abstract Item createItem();
    public abstract Address createLocation();
    public abstract Order createOrder();
    public abstract OrderDetails createOrderDetails();
    public abstract ShipmentDetails createShipmentDetails();
    public abstract Wishlist createWishlist();


    public static BackendFactory getFactory() {
        if(Configuration.hibernation == HibernationType.inMemory) {
            return BackendInMemoryFactory.getFactory();
        } else if (Configuration.hibernation == HibernationType.jdbc) {
            return BackendJdbcFactory.getFactory();
        }
        throw new RuntimeException(Configuration.hibernation + " not implemented yet");
    }
}