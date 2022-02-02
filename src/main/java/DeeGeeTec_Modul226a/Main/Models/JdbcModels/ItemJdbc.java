package DeeGeeTec_Modul226a.Main.Models.JdbcModels;

import DeeGeeTec_Modul226a.Dbconfig.JdbcDb;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
