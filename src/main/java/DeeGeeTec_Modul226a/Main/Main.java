package DeeGeeTec_Modul226a.Main;

import DeeGeeTec_Modul226a.Dbconfig.JdbcDb;

import DeeGeeTec_Modul226a.Main.Factories.BackendFactory;
import DeeGeeTec_Modul226a.Main.Models.Account;
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
        BackendFactory testFactory = BackendFactory.getFactory();
        JdbcDb.getConnection();
        System.out.println("""
        1. 
        """);
    }
}
