package DeeGeeTec_Modul226a.Main;

import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Account;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Address;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Wishlist;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.AddressInMemory;
import DeeGeeTec_Modul226a.Main.Models.JdbcModels.AccountJdbc;
import DeeGeeTec_Modul226a.Main.Models.JdbcModels.AddressJdbc;
import DeeGeeTec_Modul226a.Main.Models.JdbcModels.ItemJdbc;
import DeeGeeTec_Modul226a.Main.Models.JdbcModels.WishlistJdbc;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * This is the main class of our project, it does nothing yet but will maybe have a future use.
 *
 * @author Sven, Dimitrios, Arman
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) throws SQLException, ParseException, IOException, ClassNotFoundException {
        Address address = new AddressJdbc("test", "test", "test", "test");
        Account test = new AccountJdbc("username", "password", (AddressJdbc) address, "email", "firstName", "lastName");
        Item testitem = new ItemJdbc("Klopapier", (float) 2.3);
        Wishlist testwishlist = new WishlistJdbc(new ArrayList<>(), (AccountJdbc) test);
        ((WishlistJdbc) testwishlist).additemtowishlistdb((ItemJdbc) testitem, (WishlistJdbc) testwishlist, (AccountJdbc) test);
    }
}
