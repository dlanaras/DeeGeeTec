package DeeGeeTec_Modul226a.Main.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import DeeGeeTec_Modul226a.Main.Models.Account;
import org.junit.Test;

public class AccountTest {
    @Test
    public void PasswordGetsHashed() {
        Account account = new Account();
        String testPassword = "Password";
        String expectedHash = "e6c83b282aeb2e022844595721cc00bbda47cb24537c1779f9bb84f04039e1676e6ba8573e588da1052510e3aa0a32a9e55879ae22b0c2d62136fc0a3e85f8bb";

        String hashedPassword = account.HashPassword(testPassword);

        assertEquals(hashedPassword, expectedHash, "Please learn to hash passwords (actual): " + hashedPassword + " (expected): " + expectedHash);
    }

    @Test
    public void PasswordCheckWorks() {
        Account account = new Account();
        String testPassword = "TheCoolerPassword";
        account.setPassword("TheCoolerPassword");

        assertTrue(account.CheckPassword(testPassword));
    }
}
