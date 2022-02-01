package DeeGeeTec_Modul226a.Main.Models;

public abstract class Account {


    public abstract String getEmail();

    public abstract void setEmail(String email);

    public abstract void setPassword(String password);

    public abstract int getAccountId();

    public abstract String getUsername();

    public abstract void setUsername(String username);

    public abstract String getPhoneNumber();

    public abstract void setPhoneNumber(String phoneNumber);

    public abstract Location getLocation();

    public abstract void setLocation(Location location);

    public abstract String HashPassword(String password);

    public abstract boolean CheckPassword(String userInputedPassword);

    public abstract void delete();

}
