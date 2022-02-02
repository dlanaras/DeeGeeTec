package DeeGeeTec_Modul226a.Main.test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import DeeGeeTec_Modul226a.Main.Models.AbstractModels.*;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.*;
import org.junit.Test;

public class AccountTest {


    Account accountMock = mock(AccountInMemory.class);
    /**
     * Tests if the password gets hashed correctly
     */
    @Test
    public void MockAccountPasswordGetsHashed() {
        String testPassword = "Password";
        String expectedHash = "e6c83b282aeb2e022844595721cc00bbda47cb24537c1779f9bb84f04039e1676e6ba8573e588da1052510e3aa0a32a9e55879ae22b0c2d62136fc0a3e85f8bb";

        when(accountMock.HashPassword(testPassword)).thenReturn("e6c83b282aeb2e022844595721cc00bbda47cb24537c1779f9bb84f04039e1676e6ba8573e588da1052510e3aa0a32a9e55879ae22b0c2d62136fc0a3e85f8bb");

        String hashedPassword = accountMock.HashPassword(testPassword);

        verify(accountMock);

        assertEquals(hashedPassword, expectedHash);
    }

    @Test
    public void AccountPasswordGetsHashed() {
        String testPassword = "Password";
        String expectedHash = "e6c83b282aeb2e022844595721cc00bbda47cb24537c1779f9bb84f04039e1676e6ba8573e588da1052510e3aa0a32a9e55879ae22b0c2d62136fc0a3e85f8bb";

        String hashedPassword = accountMock.HashPassword("Password");

        verify(accountMock);

        assertEquals(hashedPassword, expectedHash);
    }

    /**
     * checks if the function correctly functions to automaticly hash the password and compare them
     */
    @Test
    public void PasswordCheckWorks() {
        String testPassword = "TheCoolerPassword";
        accountMock.setPassword("TheCoolerPassword");

        assertTrue(accountMock.CheckPassword(testPassword));
    }
}