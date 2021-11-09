package DeeGeeTec_Modul226a.Main.Controllers;

import DeeGeeTec_Modul226a.Main.Models.Account;
import DeeGeeTec_Modul226a.Main.Models.Item;
import DeeGeeTec_Modul226a.Main.Models.Wishlist;
/**
 * This is the controller that handles everything that has to do with the WishList.
 *
 * @author Sven, Dimitrios, Arman
 * @version 2.0
 */
public class WishlistHandler {
    /**
     * @param item the item to be added to the wishlist
     */
    public void AddItemToWishlist(Item item) {
        Account currentUser = AccountHandler.getCurrentUser();
        //get wishlist of current account
        //wishlist.AddItem(item)
    }

    /**
     * @param itemId ID of the item to be removed from the wishlist
     */
    public void RemoveItemFromWishlist(int itemId) {
        Account currentUser = AccountHandler.getCurrentUser();
        //Get current account wishlist
        //DELETE * FROM 'Wishlist' where 'Wishlist'.'itemFK' = itemId;
    }

    /**
     * @return returns the wishlist of a user
     */
    public Wishlist GetCurrentWishlist() {
        //return wishlist of current user
        Account currentUser = AccountHandler.getCurrentUser();
        return new Wishlist();
    }
}
