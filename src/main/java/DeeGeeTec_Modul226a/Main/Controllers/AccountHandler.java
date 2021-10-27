package DeeGeeTec_Modul226a.Main.Controllers;

import DeeGeeTec_Modul226a.Main.Models.Account;
import DeeGeeTec_Modul226a.Main.Models.Location;

public class AccountHandler {
    private String sessionCookie;


    public void Login(String username, String password) {
        //search through db for username
        /* don't know how dbs are used in java so im writing an example of how it would be in SQL

        if(getCurrentUser != null) {
            // continue to web frontend
        } else {

            try {
                Account accountToBeLoggedIn = SELECT * FROM 'Account' WHERE 'Account'.'username' = username;
                bool userNameExists = accountToBeLoggedIn != null //there might be a better way to check than this
                bool isPasswordCorrect = accountToBeLoggedIn.CheckPassword(password);

                if(isPasswordCorrect && userNameExists) {
                    // continue to web frontend of Deegeetec Website and create sessioncookie for user
                } else {
                    // show incorrect password or username in frontend login page
                }
            }
            catch (Exception e) {

            }
        }
         */
    }

    //no logout method since that should be possible with only frontend (deleting Session Cookie and refreshing)

    public void Register(String username, String password, String email, String phoneNumber, Location location) {
        /*

            Account accountMightAlreadyExist = SELECT * FROM 'Account' WHERE 'Account'.'username' = username;
            bool accountAlreadyExists = accountMightAlreadyExist != null;

            if(!accountAlreadyExists) {
                Location possiblyExistingLocation = SELECT * FROM 'Location'
                WHERE 'street' = location.getStreet()
                AND 'plz' = location.getPlz()
                AND 'streetNum' = location.getStreetNum()
                AND 'place' = location.getPlace();

                bool locationAlreadyExists = possiblyExistingLocation != null;

                if(locationAlreadyExists) {
                   INSERT VALUES(password, username, email, phoneNumber, possiblyExistingLocation.GetLocationId()) INTO 'Account'
                } else {
                    INSERT VALUES(location.getStreet, location.getPlz, location.getStreetNum, location.getPlace)
                    Location newLocation = repeat line 35 to 39
                    INSERT VALUES(password, username, email, phoneNumber, newLocation.getLocationId) INTO 'Account'
                }
                //continue to frontend login page and create cookie(in the frontend)
            } else {
                //error message in frontend account already exists
            }

         */
    }

    public static String[] getCurrentSessionCookieAsStrings() {
        //TODO: will get sessionCookie through http post
        return new String[] {"Joe", "HashedPassword"};
    }

    public static Account getCurrentUser() {
        //TODO: decided that the cookie is just gonna have the username and the hash of the user as a Name
        //TODO: then it will be read and with the help of an SQL query the user will be found and selected
        //Example
        String userName = getCurrentSessionCookieAsStrings()[0];
        String hashedPassword = getCurrentSessionCookieAsStrings()[1];

        //new Account() to be replaced with SQL query that finds user with
        // matching username and password (using the userName and hashedPassword strings above)
        Account currentAccount = new Account();
        return currentAccount;

    }


}
