package DeeGeeTec_Modul226a.Main.Controllers;

import DeeGeeTec_Modul226a.Main.Models.Account;
import DeeGeeTec_Modul226a.Main.Models.Cart;
import DeeGeeTec_Modul226a.Main.Models.Item;
import DeeGeeTec_Modul226a.Main.Models.Wishlist;

import java.util.List;

public class CartHandler {

    public void AddItemToCart(Item item) {
        //find user cart with items joined using SQL query and save it as a Cart
        //cart.AddItem(item)
        //save changes in DB using SQL query
    }

    public void RemoveItemFromCart(int itemId) {
        //Get user cart using SQL query
        //DELETE * FROM 'Cart' where 'Cart'.'itemFK' = itemId;

    }

    public void AddItemsFromWishlist(List<Item> wishlist) {
        //Get user wishlist and save it as wishlist including item list (with help of inner join)
        //Get user cart
        //foreach(Item item in wishlist) ->  cart.AddItem(item)
        //Save changes in DB
    }

    public Cart GetCart() {
        //get current user and get his cart
        Account currentUser = AccountHandler.getCurrentUser();
        //would return currentUser cart by finding corresponding foreign key in DB
        return new Cart();

    }
}
