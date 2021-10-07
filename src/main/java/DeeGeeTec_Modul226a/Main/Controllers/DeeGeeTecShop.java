package DeeGeeTec_Modul226a.Main.Controllers;

import DeeGeeTec_Modul226a.Main.Models.Item;
import DeeGeeTec_Modul226a.Main.Models.Order;

public class DeeGeeTecShop {
    AccountHandler account = new AccountHandler();
    CartHandler cart = new CartHandler();
    OrderHandler order = new OrderHandler();
    WishlistHandler wishlist = new WishlistHandler();

    public void LoginUser(String password) {
        //use name and password to search db account
    }

    public void RegisterUser() {
        //create new account to save into db
  }

    public void AddItemToCart(Item item) {

    }

    //aka create order
    public Order BuyItem() {
        return new Order(); //will be used
    }

    public void AddItemToWishlist() {

    }

    public void ImportWishlistItemsToCart() {

    }
}
