package DeeGeeTec_Modul226a.Main.Tests;

import DeeGeeTec_Modul226a.Main.Controllers.AccountHandler;
import DeeGeeTec_Modul226a.Main.Models.Account;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class AccountHandlerTest {
    private final AccountHandler accountHandler;

    public AccountHandlerTest() {
        accountHandler = new AccountHandler();
    }

    //TODO: they should return an httpstatus that i can use to compare
    /*@Test
    public void UserCanLogin() {
        assertEquals(accountHandler.Login("Joe", "HashedPassword"), HttpURLConnection.HTTP_OK) //or something like that
    }

    @Test
    public void UserCantLoginWithWrongUsername() {
        assertNotEquals(accountHandler.Login("Joee", "HashedPassword").equals(HttpURLConnection.HTTP_OK)) //or something like that

    }

    @Test
    public void UserCantLoginWithWrongPassword() {
        assertNotEquals(accountHandler.Login("Joe", "HashedPassworde").equals(HttpURLConnection.HTTP_OK)) //or something like that

    }

    @Test
    public void UserCanRegister() {
        assertEquals(accountHandler.Register("Joe", "HashedPassword", ...), HttpURLConnection.HTTP_CREATED)
    }*/

    @Test
    public void ReturnsCurrentUser(){
        /*
        accountHandler.Login("Joe", "HashedPassword");
        string userName = accountHandler.GetCurrentUser().getUsername()
        bool passwordsAreMatching = accountHandler.GetCurrentUser().checkPassword("HashedPassword");

        assertTrue(passwordsAreMatching);
        assertEquals(userName, "Joe");
         */
    }
}
