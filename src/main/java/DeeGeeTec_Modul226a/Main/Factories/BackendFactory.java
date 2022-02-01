package DeeGeeTec_Modul226a.Main.Factories;

import DeeGeeTec_Modul226a.HibernationType;
import DeeGeeTec_Modul226a.Dbconfig.Configuration;
import DeeGeeTec_Modul226a.Main.Models.Account;
import DeeGeeTec_Modul226a.Main.Models.Cart;
import DeeGeeTec_Modul226a.Main.Models.Item;
import DeeGeeTec_Modul226a.Main.Models.Address;
import DeeGeeTec_Modul226a.Main.Models.Order;
import DeeGeeTec_Modul226a.Main.Models.OrderDetails;
import DeeGeeTec_Modul226a.Main.Models.ShipmentDetails;
import DeeGeeTec_Modul226a.Main.Models.Wishlist;

public abstract class BackendFactory {

    public abstract Account createAccount();
    public abstract Cart createCart();
    public abstract Item createItem();
    public abstract Address createLocation();
    public abstract Order createOrder();
    public abstract OrderDetails createOrderDetails();
    public abstract ShipmentDetails creaShipmentDetails(); 
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