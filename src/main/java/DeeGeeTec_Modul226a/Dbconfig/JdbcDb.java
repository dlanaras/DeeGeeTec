package DeeGeeTec_Modul226a.Dbconfig;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.text.ParseException;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class JdbcDb {
public static Connection connection;
    public static Connection getConnection() throws org.json.simple.parser.ParseException, ClassNotFoundException, SQLException, IOException {
        Object ob = new JSONParser().parse(new FileReader("src/main/java/DeeGeeTec_Modul226a/Dbconfig/Configuration.json"));
        JSONObject js = (JSONObject) ob;
        Connection connection = DriverManager.getConnection(
                "jdbc:mariadb://" + Configuration.jdbcUrl + "/" + Configuration.dbname,
                (String) js.get("username"), (String) js.get("password")
        );
        System.out.println("Connection valid? =" + connection.isValid(5));
        return null;
    }


}
