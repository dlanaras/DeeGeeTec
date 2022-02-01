package DeeGeeTec_Modul226a.Main.Models.JdbcModels;

import org.apache.commons.codec.digest.DigestUtils;

import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Account;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Address;

public class AccountJdbc extends Account {

    //TODO: actually connect with db

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
    private Address location;

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

    public AccountJdbc(String username, String password, Address location, String phoneNumber) {
        this.username = username;
        this.password = this.HashPassword(password);
        this.phoneNumber = phoneNumber;
        this.location = location;

        //... add it to db
    }

    public AccountJdbc(String username, String password, Address location, String phoneNumber, String email) {
        this.username = username;
        this.password = this.HashPassword(password);
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.email = email;
        //... add it to db
    }

    public AccountJdbc(String username, String password, Address location) { //phonenumber isn't necessary
        this(username, password, location, null);
        //... add it to db
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
    public Address getLocation() {
        return location;
    }

    @Override
    public void setLocation(Address location) {
        this.location = location;
    }

    @Override
    public String HashPassword(String password) {
        return DigestUtils.sha512Hex(password);
    }

    /**
     * @param userInputedPassword the password the user provided to log in
     * @return boolean that checks if the hashed password equals our saved hashed password
     */
    @Override
    public boolean CheckPassword(String userInputedPassword) {
        return this.HashPassword(userInputedPassword).equals(this.password);
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        
    }
}
