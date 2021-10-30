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
 * @version 1.0
 */
public class CartHandler {

    /**
     * @param item The Item that has to be added to the cart
     */
    public void AddItemToCart(Item item) {
        //find user cart with items joined using SQL query and save it as a Cart
        //cart.AddItem(item)
        //save changes in DB using SQL query
    }

    /**
     * @param itemId ID of the Item to be removed
     */
    public void RemoveItemFromCart(int itemId) {
        //Get user cart using SQL query
        //DELETE * FROM 'Cart' where 'Cart'.'itemFK' = itemId;

    }

    /**
     * @param wishlist A list of the items which are in the wishlist
     *
     */
    public void AddItemsFromWishlist(List<Item> wishlist) {
        //Get user wishlist and save it as wishlist including item list (with help of inner join)
        //Get user cart
        //foreach(Item item in wishlist) ->  cart.AddItem(item)
        //Save changes in DB
    }

    /**
     * @return gets all the items from the shopping cart of the user
     */
    public Cart GetCart() {
        //get current user and get his cart
        Account currentUser = AccountHandler.getCurrentUser();
        //would return currentUser cart by finding corresponding foreign key in DB
        return new Cart();

    }
}
