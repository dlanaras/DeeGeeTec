package DeeGeeTec_Modul226a.Main.Models.JdbcModels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.codec.digest.DigestUtils;

import DeeGeeTec_Modul226a.Dbconfig.JdbcDb;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Account;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Address;

public class AccountJdbc extends Account {

    // TODO: actually connect with db

    /**
     * This String contains the password
     */
    private String password;
    /**
     * This String contains the username
     */
    private String username;
    /**
     * This String contains the Phonenumber
     */
    private String phoneNumber;
    /**
     * This Contains the Location connected to a account from the DB
     */
    private Address address;

    private String firstName;

    private String lastName;

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This is the String that contains the Email of the account
     */
    private String email;

    /**
     * This Int contains the accountID
     */

    private int accountId;

    public AccountJdbc(String username, String password, Address address, String phoneNumber, String email, String firstName, String lastName) {
        this.username = username;
        this.password = this.HashPassword(password);
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;

        Connection conn = JdbcDb.getConnection();


       try {
            conn.setAutoCommit(false);
    
            PreparedStatement accountStatement = conn.prepareStatement("insert into account_tbl (Lastname, Firstname, Username, Email, Password, address_IDFK) values (?,?,?,?,?,?)");
            accountStatement.setString(1, this.lastName);
            accountStatement.setString(2, this.firstName);  
            accountStatement.setString(3, this.username);
            accountStatement.setString(4, this.email);
            accountStatement.setString(5, this.password);
            accountStatement.setInt(6, address.getAddressId());
            
            accountStatement.executeUpdate();
            conn.commit();
            conn.setAutoCommit(true);
            } catch(SQLException e) {
                System.out.printf("Error with account SQL statement %s", e);
            }

    }

    public AccountJdbc(String username, String password, Address address, String email, String firstName, String lastName) { //phonenumber isn't necessary
        this(username, password, address, null, firstName, lastName, email);
    }


    @Override
    public void setPassword(String password) {
        this.password = this.HashPassword(password);
    }

    @Override
    public int getAccountId() {
        return this.accountId;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String HashPassword(String password) {
        return DigestUtils.sha512Hex(password);
    }

    /**
     * @param userInputedPassword the password the user provided to log in
     * @return boolean that checks if the hashed password equals our saved hashed
     *         password
     */
    @Override
    public boolean CheckPassword(String userInputedPassword) {
        return this.HashPassword(userInputedPassword).equals(this.password);
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub

    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void setLastName(String lastName) {
      this.lastName = lastName;
    }
}
