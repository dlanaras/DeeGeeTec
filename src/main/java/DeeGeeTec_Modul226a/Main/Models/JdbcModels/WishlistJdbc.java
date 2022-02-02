package DeeGeeTec_Modul226a.Main.Models.JdbcModels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DeeGeeTec_Modul226a.Dbconfig.JdbcDb;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Account;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Wishlist;

public class WishlistJdbc extends Wishlist {
    /**
     * ID of the wishlist
     */
    private int wishlistId;
    private Account account;
    public WishlistJdbc(List<Item> i, AccountJdbc account) {
        this.account = account;

        Connection conn = JdbcDb.getConnection();
        try {
            conn.setAutoCommit(false);

            PreparedStatement orderStatement = conn.prepareStatement("insert into wishlist_tbl (account_IDFK) values (?)");
            //has to be checked if works
            orderStatement.setInt(1, account.getAccountIdfromdb(account));

            orderStatement.executeUpdate();
            conn.commit();
            conn.setAutoCommit(true);
        } catch(SQLException e) {
            System.out.printf("Error with account SQL statement %s", e);
        }

        }

        public void additemtowishlistdb(ItemJdbc item, WishlistJdbc wishlist, AccountJdbc account){
            Connection conn = JdbcDb.getConnection();
            try {
                conn.setAutoCommit(false);

                PreparedStatement wishlistStatement = conn.prepareStatement("insert into itemsperwishlist_tbl (items_IDFK, wishlist_IDFK) values (?,?)");
                //has to be checked if works
                wishlistStatement.setInt(1, item.getItemidfromDB(item));
                wishlistStatement.setInt(2, wishlist.getwishlistidfromDB(account));
                wishlistStatement.executeUpdate();
                conn.commit();
                conn.setAutoCommit(true);
            } catch(SQLException e) {
                System.out.printf("Error with account SQL statement %s", e);
            }
        }
        public void removeItem(Item item){

        }
        public List<Item> getItems(){
        return null;
        }
    public int getwishlistidfromDB(AccountJdbc account) {
        Connection conn = JdbcDb.getConnection();
        int wishlistidreturned = 0;
        try (PreparedStatement statement = conn.prepareStatement("""
            SELECT wishlist_ID
            FROM wishlist_tbl
            WHERE account_IDFK = ?;
            
        """)) {
            statement.setInt(1, account.getAccountIdfromdb(account));
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                wishlistidreturned = resultSet.getInt(1); // by column index


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return wishlistidreturned;
    };
    @Override
    public void setItems(List<Item> items) {
    }

    @Override
    public void additemtowishlist(Item item) {

    }

    @Override
    public int getWishlistId() {
        return this.wishlistId;
    }

    


    @Override
    public void delete() {
        // TODO Auto-generated method stub
        System.out.println("Not Implemented yet");
    }

}
