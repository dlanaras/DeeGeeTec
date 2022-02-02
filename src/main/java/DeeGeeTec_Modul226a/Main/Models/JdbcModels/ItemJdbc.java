package DeeGeeTec_Modul226a.Main.Models.JdbcModels;

import DeeGeeTec_Modul226a.Dbconfig.JdbcDb;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Address;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemJdbc extends Item {
    /**
     * This string contains the Name of the Item
     */
    private String itemName;
    /**
     * This float contains the Price of an Item
     */
    private float price;
    /**
     * This Int contains the ID of the Item
     */
    private int itemId;

    public ItemJdbc(String itemName, float price) {
        this.itemName = itemName;
        this.price = price;

        Connection conn = JdbcDb.getConnection();
        //adds the item to the db
        try {
            conn.setAutoCommit(false);

            PreparedStatement itemStatement = conn.prepareStatement("insert into items_tbl (itemname, price) values (?,?)");
            itemStatement.setString(1, this.itemName);
            itemStatement.setFloat(2, this.price);

            itemStatement.executeUpdate();
            conn.commit();
            conn.setAutoCommit(true);
        } catch(SQLException e) {
            System.out.printf("Error with account SQL statement %s", e);
        }
    }
    public int getItemidfromDB(Item item) {
        Connection conn = JdbcDb.getConnection();
        int itemidreturned = 0;
        try (PreparedStatement statement = conn.prepareStatement("""
            SELECT item_ID
            FROM items_tbl
            WHERE itemname = ?;
            
        """)) {
            statement.setString(1, item.getItemName());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                itemidreturned = resultSet.getInt(1); // by column index


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return itemidreturned;
    };
    @Override
    public int getItemId() {
        return this.itemId; 
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public void delte() {
        // TODO Auto-generated method stub
        
    }
}
