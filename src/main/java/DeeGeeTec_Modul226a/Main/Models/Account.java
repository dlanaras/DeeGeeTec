package DeeGeeTec_Modul226a.Main.Models;

import org.apache.commons.codec.digest.DigestUtils;

public class Account {
    private String password;
    private String username;
    private String email;
    private String phoneNumber;
    private Location location;

    public void setPassword(String password) {
        this.password = this.HashPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
