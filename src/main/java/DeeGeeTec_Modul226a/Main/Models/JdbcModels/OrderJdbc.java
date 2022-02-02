package DeeGeeTec_Modul226a.Main.Models.JdbcModels;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import DeeGeeTec_Modul226a.Dbconfig.JdbcDb;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Account;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Order;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.OrderDetails;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.ShipmentDetails;

public class OrderJdbc extends Order {
    /**
     * This int contains the ID of the order
     */
    private int orderId;
    /**
     * This contains the account of the logged in user
     */
    private Account account;
    /**
     * This contains a list with all ordered items of a order
     */
    private List<OrderDetails> orderDetails;
    /**
     * this contains the shipmentdetails of a order
     */
    private Date date = new Date();

    public OrderJdbc(Account account, List<OrderDetails> orderDetails) {
        this.account = account;
        this.orderDetails = orderDetails;
        this.date = Calendar.getInstance().getTime();

        Connection conn = JdbcDb.getConnection();
        //adds the order to the db
        try {
            conn.setAutoCommit(false);

            PreparedStatement orderStatement = conn.prepareStatement("insert into order_tbl (orderdate, cancelled, account_IDFK) values (?,?,?)");
            //has to be checked if works
            orderStatement.setString(1, String.valueOf(this.date));
            orderStatement.setInt(2, 0);
            orderStatement.setInt(3, account.getAccountId());

            orderStatement.executeUpdate();
            conn.commit();
            conn.setAutoCommit(true);
        } catch(SQLException e) {
            System.out.printf("Error with account SQL statement %s", e);
        }
    }


    @Override
    public int getOrderId() {
        return this.orderId;
    }

    @Override
    public Account getAccount() {
        return account;
    }

    @Override
    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    @Override
    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public void delete() {
        
        
    }

}
