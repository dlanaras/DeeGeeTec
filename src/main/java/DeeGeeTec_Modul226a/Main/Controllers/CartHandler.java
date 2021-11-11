package DeeGeeTec_Modul226a.Main.Controllers;

import DeeGeeTec_Modul226a.Main.Models.Account;
import DeeGeeTec_Modul226a.Main.Models.Cart;
import DeeGeeTec_Modul226a.Main.Models.Item;
import DeeGeeTec_Modul226a.Main.Models.Wishlist;

import java.util.List;

/**
 * This Controller handles everything that has to do with the Shopping Cart
 *
 * @author Sven, Dimitrios, Arman
 * @version 2.0
 */
public class CartHandler {

    private final WishlistHandler wishlistHandler = new WishlistHandler();

    /**
     * @param item The Item that has to be added to the cart
     */
    public void AddItemToCart(Item item) {
        Cart userCart = this.GetCart();
        userCart.addItem(item);
    }

    /**
     * @param item Item to be removed
     */
    public void RemoveItemFromCart(Item item) {
        Cart userCart = this.GetCart();
        userCart.removeItem(item);
    }


    /**
     * Imports data from wishlist into current cart
     */
    public void AddItemsFromWishlist() {
        Cart userCart = this.GetCart();
        userCart.setItems(wishlistHandler.GetCurrentWishlist().getItems());
    }

    /**
     * @return gets all the items from the shopping cart of the user
     */
    public Cart GetCart() {
        //get current user and get his cart
        Account currentUser = AccountHandler.getCurrentUser();
        Cart userCart = new Cart(); //instead of new Cart it would get the cart of the user from the frontend (localstorage)
        // since it doesn't get saved in the db, or we would get the cart from a nosql db if we decide to add that in the next module

        return userCart; //would be the cart of the user
    }
}
