package DeeGeeTec_Modul226a.Main.Controllers;

import java.net.URISyntaxException;
import java.util.InputMismatchException;

import org.springframework.http.*;

import DeeGeeTec_Modul226a.Main.Models.Account;
import DeeGeeTec_Modul226a.Main.Models.Location;

/**
 * This is the controller that handles everything that has to do with the account.
 *
 * @author Sven, Dimitrios, Arman
 * @version 2.0
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

        /*if(AccountHandler.getCurrentUser() != null) {
            return ResponseEntity.ok().build();
            // continue to web frontend
        } else {
        TODO: should be readded at the next IT-Module (226b) when it actually returns real data
         */

            try {
                Account accountToBeLoggedIn = new Account(username, password, new Location());
                /*SELECT * FROM 'Account' WHERE 'Account'.'username' = username;*/

                //Temporarily here until program actually has a db connection
                boolean userNameExists = accountToBeLoggedIn.getUsername().equals("Joe");
                boolean isPasswordCorrect = accountToBeLoggedIn.CheckPassword("HashedPassword");



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


        return ResponseEntity.status(403).build();
    }

    //no logout method since that should be possible with only frontend (deleting Session Cookie and refreshing)

    /**
     * @param username The Username of the account
     * @param password The Password of the account
     * @param phoneNumber The PhoneNumber of the account
     * @param location The Location of the account
     */
    public ResponseEntity<Account> Register(String username, String password, String phoneNumber, Location location) throws URISyntaxException {

            Account account = null; /*SELECT * FROM 'Account' WHERE 'Account'.'username' = username;*/

            if(account == null) {
                Location possiblyExistingLocation = new Location();/*SELECT * FROM 'Location'
                WHERE 'street' = location.getStreet()
                AND 'plz' = location.getPlz()
                AND 'streetNum' = location.getStreetNum()
                AND 'place' = location.getPlace();*/

                boolean locationAlreadyExists = possiblyExistingLocation != null;

                if(locationAlreadyExists) {
                    account = new Account(username, password, location, phoneNumber);
                    return new ResponseEntity<Account>(account, HttpStatus.CREATED);
                   //INSERT VALUES(password, username, email, phoneNumber, possiblyExistingLocation.GetLocationId()) INTO 'Account'
                } else {
                    //INSERT VALUES(location.getStreet, location.getPlz, location.getStreetNum, location.getPlace)
                    location = new Location();
                    account = new Account(username, password, location, phoneNumber);
                    //INSERT VALUES(password, username, email, phoneNumber, newLocation.getLocationId) INTO 'Account'
                    return new ResponseEntity<Account>(account, HttpStatus.CREATED);
                }
                //continue to frontend login page and create cookie(in the frontend)
            } else {
                return ResponseEntity.status(403).build();
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
        String[] currentSessionCookie = getCurrentSessionCookieAsStrings();

        String userName = currentSessionCookie[0];
        String hashedPassword = currentSessionCookie[1];

        String expectedUsername = "Joe";
        String expectedPassword = "HashedPassword";

        //new Account() to be replaced with SQL query that finds user with
        // matching username and password (using the userName and hashedPassword strings above)
        if(userName.equals(expectedUsername) && hashedPassword.equals(expectedPassword))
        {
            Account currentAccount = new Account(userName, hashedPassword, new Location());

            return currentAccount;
        }
        else
        {
            throw new InputMismatchException(); //only temporary for testing purposes
        }

    }


}
