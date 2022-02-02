package DeeGeeTec_Modul226a.Main.Models.InMemoryModels;

import java.util.ArrayList;

import org.apache.commons.codec.digest.DigestUtils;

import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Account;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Address;

public class AccountInMemory extends Account {
    private static final ArrayList<AccountInMemory> accounts = new ArrayList<>();

    private String password;
    private String username;
    private String phoneNumber;
    private Address address;
    private String email;
    private static int accountId;
    private String firstName;
    private String lastName;

    
    public AccountInMemory(String username, String password, Address address, String phoneNumber, String email, String firstName, String lastName) {
        this.username = username;
        this.password = this.HashPassword(password);
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        accounts.add(this);
        accountId++;
    }

    public AccountInMemory(String username, String password, Address address, String email, String firstName, String lastName) { //phonenumber isn't necessary
        this(username, password, address, null, email, firstName, lastName);
    }

    

    @Override
    public void setPassword(String password) {
        this.password = this.HashPassword(password);
    }

    @Override
    public int getAccountId() {
        return accountId;
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
        return this.address;
    }

    @Override
    public void setAddress(Address address) {
        this.address = address;
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
