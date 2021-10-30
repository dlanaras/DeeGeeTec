package DeeGeeTec_Modul226a.Main.Controllers;

import DeeGeeTec_Modul226a.Main.Models.Account;
import DeeGeeTec_Modul226a.Main.Models.Item;
import DeeGeeTec_Modul226a.Main.Models.Wishlist;

public class WishlistHandler {
    public void AddItemToWishlist(Item item) {
        Account currentUser = AccountHandler.getCurrentUser();
        //get wishlist of current account
        //wishlist.AddItem(item)
    }

    public void RemoveItemFromWishlist(int itemId) {
        Account currentUser = AccountHandler.getCurrentUser();
        //Get current account wishlist
        //DELETE * FROM 'Wishlist' where 'Wishlist'.'itemFK' = itemId;
    }

    public Wishlist GetCurrentWishlist() {
        //return wishlist of current user
        Account currentUser = AccountHandler.getCurrentUser();
        return new Wishlist();
    }
}
