package DeeGeeTec_Modul226a.Main.Models;

import org.apache.commons.codec.digest.DigestUtils;

public class Account {
    private String password;
    private String username;
    private String phoneNumber;
    private Location location;
    private int accountId;

    public Account(String username, String password, String phoneNumber, Location location) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public Account() {}

    public void setPassword(String password) {
        this.password = this.HashPassword(password);
    }

    public int getAccountId() { return this.accountId; }

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

    public boolean CheckPassword(String userInputedPassword) {
        return this.HashPassword(userInputedPassword).equals(this.password);
    }

}
