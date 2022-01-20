package DeeGeeTec_Modul226a.Dbconfig;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.text.ParseException;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class JdbcDb {

    public static Connection getConnection() throws org.json.simple.parser.ParseException, ClassNotFoundException {
        try {
            Object ob = new JSONParser().parse(new FileReader("./Configuration.json"));
            JSONObject js = (JSONObject) ob;

            String url = Configuration.jdbcUrl;
            String password = (String) js.get("password");
            String username = (String) js.get("username");

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);
            
            return con;

        } catch (IOException e) {
            //log4J?
        } catch (org.json.simple.parser.ParseException e) {
            
        } catch (ClassNotFoundException e) {

        } catch (SQLException e) {
            
        }
        
        return null;
    }


}
