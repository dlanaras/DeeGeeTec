package DeeGeeTec_Modul226a.Main.Tests;

import DeeGeeTec_Modul226a.Main.Controllers.AccountHandler;
import DeeGeeTec_Modul226a.Main.Models.Account;

import static org.junit.Assert.*;

import DeeGeeTec_Modul226a.Main.Models.Location;
import jdk.jshell.spi.ExecutionControl;
import org.apache.commons.lang3.NotImplementedException;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpStatus;

import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.util.InputMismatchException;

public class AccountHandlerTest {
    private final AccountHandler accountHandler;

    public AccountHandlerTest() {
        accountHandler = new AccountHandler();
    }

    @Test
    public void UserCanLogin() {
        assertEquals(HttpStatus.OK, accountHandler.Login("Joe", "HashedPassword").getStatusCode());
    }

    @Test
    public void UserCantLoginWithWrongUsername() {
        assertEquals(HttpStatus.FORBIDDEN, accountHandler.Login("Joee", "HashedPassword").getStatusCode());

    }

    @Test
    public void UserCantLoginWithWrongPassword() {
        assertEquals(HttpStatus.FORBIDDEN, accountHandler.Login("Joe", "HashedPassworde").getStatusCode());

    }

    /**
     * Test to check if new users can register themselfs
     */
    @Test
    public void UserCanRegister() throws URISyntaxException {
        assertEquals(HttpStatus.CREATED, accountHandler.Register("yo", "coolPassword", "012389012", new Location()).getStatusCode());
        //assertEquals(accountHandler.Register("Joe", "HashedPassword", ...), HttpURLConnection.HTTP_CREATED)
    }

    /**
     * Test to check if logging in is possible
     */
    @Test
    public void ReturnsCurrentUser() {
        Account expectedAccount = new Account("Joe", "HashedPassword", new Location());

        assertEquals(expectedAccount.getUsername(), AccountHandler.getCurrentUser().getUsername());
        assertTrue(AccountHandler.getCurrentUser().CheckPassword("HashedPassword"));
        /*
        accountHandler.Login("Joe", "HashedPassword");
        string userName = accountHandler.GetCurrentUser().getUsername()
        bool passwordsAreMatching = accountHandler.GetCurrentUser().checkPassword("HashedPassword");

        assertTrue(passwordsAreMatching);
        assertEquals(userName, "Joe");
         */
    }
}
