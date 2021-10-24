package DeeGeeTec_Modul226a.Main.Controllers;

import DeeGeeTec_Modul226a.Main.Models.Account;
import DeeGeeTec_Modul226a.Main.Models.Location;

public class AccountHandler {
    public void Login(String username, String password) {
        //search through db for username
        /* don't know how dbs are used in java so im writing an example of how it would be in SQL
        try {
            Account accountToBeLoggedIn = SELECT * FROM 'Account' WHERE 'Account'.'username' = username;
            bool userNameExists = accountToBeLoggedIn != null //there might be a better way to check than this
            bool isPasswordCorrect = accountToBeLoggedIn.CheckPassword(password);

            if(isPasswordCorrect && userNameExists) {
                // continue to web frontend of Deegeetec Website and possibly add Session Cookie
            } else {
                // show incorrect password or username in frontend login page
            }
        }
        catch (Exception e) {

        }
         */
    }

    //no logout method since that should be possible with only frontend (deleting Session Cookie)

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
                //continue to frontend login page
            } else {
                //error message in frontend account already exists
            }

         */
    }

    public static Account getCurrentUser(String sessionCookie) {
        return new Account();
        //should get current user by using sessionCookie from frontend
    }


}
