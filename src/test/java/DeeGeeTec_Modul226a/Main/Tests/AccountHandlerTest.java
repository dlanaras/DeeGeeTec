package DeeGeeTec_Modul226a.Main.Tests;

import DeeGeeTec_Modul226a.Main.Controllers.AccountHandler;
import DeeGeeTec_Modul226a.Main.Models.Account;
import static org.junit.jupiter.api.Assertions.*;


import jdk.jshell.spi.ExecutionControl;
import org.apache.commons.lang3.NotImplementedException;
import org.junit.Test;
import org.springframework.http.HttpStatus;

import java.net.HttpURLConnection;

public class AccountHandlerTest {
    private final AccountHandler accountHandler;

    public AccountHandlerTest() {
        accountHandler = new AccountHandler();
    }

    @Test
    public void UserCanLogin() {
        assertEquals(accountHandler.Login("Joe", "HashedPassword").getStatusCode(), HttpStatus.OK);
    }

    @Test
    public void UserCantLoginWithWrongUsername() {
        throw new NotImplementedException();
        //assertNotEquals(accountHandler.Login("Joee", "HashedPassword"),HttpURLConnection.HTTP_OK);

    }

    @Test
    public void UserCantLoginWithWrongPassword() {
        throw new NotImplementedException();
        //assertNotEquals(accountHandler.Login("Joe", "HashedPassworde").equals(HttpURLConnection.HTTP_OK))

    }

    /**
     * Test to check if new users can register themselfs
     */
    @Test
    public void UserCanRegister() {
        throw new NotImplementedException();
        //assertEquals(accountHandler.Register("Joe", "HashedPassword", ...), HttpURLConnection.HTTP_CREATED)
    }

    /**
     * Test to check if logging in is possible
     */
    @Test
    public void ReturnsCurrentUser(){
        throw new NotImplementedException();
        /*
        accountHandler.Login("Joe", "HashedPassword");
        string userName = accountHandler.GetCurrentUser().getUsername()
        bool passwordsAreMatching = accountHandler.GetCurrentUser().checkPassword("HashedPassword");

        assertTrue(passwordsAreMatching);
        assertEquals(userName, "Joe");
         */
    }
}
