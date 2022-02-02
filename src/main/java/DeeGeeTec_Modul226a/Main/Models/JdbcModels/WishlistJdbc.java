package DeeGeeTec_Modul226a.Main.Models.JdbcModels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    public WishlistJdbc(Account account) {
        this.account = account;

        Connection conn = JdbcDb.getConnection();
        try {
            conn.setAutoCommit(false);

            PreparedStatement orderStatement = conn.prepareStatement("insert into wishlist_tbl (account_IDFK) values (?)");
            //has to be checked if works
            orderStatement.setInt(1, account.getAccountId());

            orderStatement.executeUpdate();
            conn.commit();
            conn.setAutoCommit(true);
        } catch(SQLException e) {
            System.out.printf("Error with account SQL statement %s", e);
        }

        }

        public void addItemtoWishlist(Item item, Wishlist wishlist){
            Connection conn = JdbcDb.getConnection();
            try {
                conn.setAutoCommit(false);

                PreparedStatement wishlistStatement = conn.prepareStatement("insert into itemsperwishlist_tbl (items_IDFK, wishlist_IDFK) values (?,?)");
                //has to be checked if works
                wishlistStatement.setInt(1, item.getItemId());
                wishlistStatement.setInt(1, wishlist.getWishlistId());
                wishlistStatement.executeUpdate();
                conn.commit();
                conn.setAutoCommit(true);
            } catch(SQLException e) {
                System.out.printf("Error with account SQL statement %s", e);
            }
        }


    @Override
    public int getWishlistId() {
        return this.wishlistId;
    }

    


    @Override
    public void delete() {
        // TODO Auto-generated method stub
        
    }

}
