package DeeGeeTec_Modul226a.Main.test.java;

import DeeGeeTec_Modul226a.Dbconfig.Configuration;
import DeeGeeTec_Modul226a.Dbconfig.JdbcDb;
import DeeGeeTec_Modul226a.Main.Factories.BackendFactory;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Wishlist;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.ItemInMemory;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.WishlistInMemory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BackendFactoryTests {

    Item mockItem = mock(ItemInMemory.class);

    @Test
    public void CanAddItemsToWishList() {
        Wishlist ws = new WishlistInMemory(Arrays.asList(mockItem));

        assert(ws.getItems().size() == 1);
    }

    @Test()
    public void WrongConfigurationReturnsNull() {
        Configuration.dbname = "bruhdb";
        Assert.assertNull(JdbcDb.getConnection());
    }
}
