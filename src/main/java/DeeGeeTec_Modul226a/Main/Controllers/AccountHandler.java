package DeeGeeTec_Modul226a.Main.Controllers;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.*;
import org.springframework.http.*;

import DeeGeeTec_Modul226a.Main.Models.Account;
import DeeGeeTec_Modul226a.Main.Models.Location;

/**
 * This is the controller that handles everything that has to do with the account.
 *
 * @author Sven, Dimitrios, Arman
 * @version 0.9
 */
public class AccountHandler {
    private String sessionCookie;


    /**
     * @param username The Username of the account
     * @param password The Password of the account
     */
    public ResponseEntity<Account> Login(String username, String password) {
        //search through db for username
        //don't know how dbs are used in java so im writing an example of how it would be in SQL

        if(AccountHandler.getCurrentUser() != null) {
            return ResponseEntity.ok().build();
            // continue to web frontend
        } else {

            try {
                Account accountToBeLoggedIn = new Account();
                /*SELECT * FROM 'Account' WHERE 'Account'.'username' = username;*/
                boolean userNameExists = accountToBeLoggedIn != null; //there might be a better way to check than this
                boolean isPasswordCorrect = accountToBeLoggedIn.CheckPassword(password);

                if(isPasswordCorrect && userNameExists) {
                    // continue to web frontend of Deegeetec Website and create sessioncookie for user
                    return ResponseEntity.ok().build();
                } else {
                    return ResponseEntity.status(403).build();
                    // show incorrect password or username in frontend login page
                }
            }
            catch (Exception e) {
                System.out.println("Don't remember why i made this");
            }

        }
        return ResponseEntity.status(403).build();
    }

    //no logout method since that should be possible with only frontend (deleting Session Cookie and refreshing)

    /**
     * @param username The Username of the account
     * @param password The Password of the account
     * @param phoneNumber The PhoneNumber of the account
     * @param location The Location of the account
     */
    public void Register(String username, String password, String phoneNumber, Location location) throws URISyntaxException {

            Account accountMightAlreadyExist = new Account();/*SELECT * FROM 'Account' WHERE 'Account'.'username' = username;*/

            if(accountMightAlreadyExist != null) {
                Location possiblyExistingLocation = new Location();/*SELECT * FROM 'Location'
                WHERE 'street' = location.getStreet()
                AND 'plz' = location.getPlz()
                AND 'streetNum' = location.getStreetNum()
                AND 'place' = location.getPlace();*/

                boolean locationAlreadyExists = possiblyExistingLocation != null;

                if(locationAlreadyExists) {
                    ResponseEntity.created(new URI("/idk")).build();
                   //INSERT VALUES(password, username, email, phoneNumber, possiblyExistingLocation.GetLocationId()) INTO 'Account'
                } else {
                    //INSERT VALUES(location.getStreet, location.getPlz, location.getStreetNum, location.getPlace)
                    Location newLocation = new Location();
                    //INSERT VALUES(password, username, email, phoneNumber, newLocation.getLocationId) INTO 'Account'
                    ResponseEntity.created(new URI("/idk")).build();
                }
                //continue to frontend login page and create cookie(in the frontend)
            } else {
                ResponseEntity.status(403).build();
                //error message in frontend account already exists
            }


    }

    /**
     * @return Returns the current logged in account from a http post
     */
    public static String[] getCurrentSessionCookieAsStrings() {
        //TODO: will get sessionCookie through http post
        return new String[] {"Joe", "HashedPassword"};
    }

    /**
     * @return Returns the current user
     */
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
