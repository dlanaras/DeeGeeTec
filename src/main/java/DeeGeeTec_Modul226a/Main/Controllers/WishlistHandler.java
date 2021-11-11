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
        Wishlist currentWishList = this.GetCurrentWishlist();
        currentWishList.addWishlistItems(item);

    }

    /**
     * @param item to be removed from the wishlist
     */
    public void RemoveItemFromWishlist(Item item) {
        Wishlist currentWishList = this.GetCurrentWishlist();
        currentWishList.removeItem(item);
    }

    /**
     * @return returns the wishlist of a user
     */
    public Wishlist GetCurrentWishlist() {
        Account currentUser = AccountHandler.getCurrentUser();
        //would return the wishlist of the current user instead of a new one
        return new Wishlist();
    }
}
