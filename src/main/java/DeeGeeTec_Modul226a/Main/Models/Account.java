package DeeGeeTec_Modul226a.Main.Models;

import org.apache.commons.codec.digest.DigestUtils;

public class Account {
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
    private Location location;
    /**
     * This Int contains the accountID
     */
    private int accountId;

    public Account(String username, String password, Location location, String phoneNumber) {
        this.username = username;
        this.password = this.HashPassword(password);
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public Account(String username, String password, Location location) {
        this(username, password, location, null);
    }

    public Account(String username, String hashedPassword) {

    }

    public Account() {
    }

    public void setPassword(String password) {
        this.password = this.HashPassword(password);
    }

    public int getAccountId() {
        return this.accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String HashPassword(String password) {
        return DigestUtils.sha512Hex(password);
    }

    /**
     * @param userInputedPassword the password the user provided to log in
     * @return boolean that checks if the hashed password equals our saved hashed password
     */
    public boolean CheckPassword(String userInputedPassword) {
        return this.HashPassword(userInputedPassword).equals(this.password);
    }

}
