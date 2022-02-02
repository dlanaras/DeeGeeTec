package DeeGeeTec_Modul226a.Main;

import DeeGeeTec_Modul226a.Dbconfig.JdbcDb;
import DeeGeeTec_Modul226a.Main.Factories.BackendFactory;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Account;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Wishlist;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.AddressInMemory;
import DeeGeeTec_Modul226a.Main.Models.JdbcModels.AccountJdbc;
import DeeGeeTec_Modul226a.Main.Models.JdbcModels.ItemJdbc;
import DeeGeeTec_Modul226a.Main.Models.JdbcModels.WishlistJdbc;
import jdk.incubator.vector.VectorOperators.Test;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.sql.SQLException;

/**
 * This is the main class of our project, it does nothing yet but will maybe have a future use.
 *
 * @author Sven, Dimitrios, Arman
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) throws SQLException, ParseException, IOException, ClassNotFoundException {
        Account test = new AccountJdbc("username", "password", new AddressInMemory("test", "test", "test", "test"), "email", "firstName", "lastName");
        Item testitem = new ItemJdbc("Klopapier", (float) 2.3);
        Wishlist testwishlist = new WishlistJdbc(test);


    }
}
