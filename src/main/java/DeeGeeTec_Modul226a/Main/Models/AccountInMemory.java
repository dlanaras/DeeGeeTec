package DeeGeeTec_Modul226a.Main.Models;

import java.util.ArrayList;

import org.apache.commons.codec.digest.DigestUtils;

public class AccountInMemory extends Account {
    private static final ArrayList<AccountInMemory> accounts = new ArrayList<>();

    private String password;
    private String username;
    private String phoneNumber;
    private Location location;
    private String email;
    private int accountId; //TODO: consider adding this into a hashmap 

    

    public AccountInMemory(String username, String password, Location location, String phoneNumber) {
        this.username = username;
        this.password = this.HashPassword(password);
        this.phoneNumber = phoneNumber;
        this.location = location;
        accounts.add(this);
    }


    public AccountInMemory(String username, String password, Location location, String phoneNumber, String email) {
        this.username = username;
        this.password = this.HashPassword(password);
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.email = email;
        accounts.add(this);
    }

    public AccountInMemory(String username, String password, Location location) { //phonenumber isn't necessary
        this(username, password, location, null);
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
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String HashPassword(String password) {
        return DigestUtils.sha512Hex(password);
    }

    @Override
    public boolean CheckPassword(String userInputedPassword) {
        return this.HashPassword(userInputedPassword).equals(this.password);
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void delete() {
        accounts.remove(this);
    }
}
