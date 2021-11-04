package DeeGeeTec_Modul226a.Main.Models;

import java.util.List;

public class Wishlist {
    /**
     * A list of all items in the wishlist
     */
    private List<Item> wishlistItems;
    /**
     * ID of the wishlist
     */
    private int wishlistId;

    public int getWishlistId() { return this.wishlistId; }

    public List<Item> getItems() {
        return wishlistItems;
    }

    public void setItems(List<Item> items) {
        this.wishlistItems = items;
    }

}
