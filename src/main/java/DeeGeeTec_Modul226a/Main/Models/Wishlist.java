package DeeGeeTec_Modul226a.Main.Models;

import java.util.List;

public class Wishlist {
    private List<Item> wishlistItems;

    public List<Item> getItems() {
        return wishlistItems;
    }

    public void setItems(List<Item> items) {
        this.wishlistItems = items;
    }

    public void addItemToWishlist(Item itemToAdd){
        //adds an item to the wishlist
        wishlistItems.add(itemToAdd);
    }
}
