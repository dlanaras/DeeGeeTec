package DeeGeeTec_Modul226a.Main.Models;

import java.util.List;

public class Wishlist {
    private List<Item> wishlistItems;
    private int wishlistId;

    public int getWishlistId() { return this.wishlistId; }

    public List<Item> getItems() {
        return wishlistItems;
    }

    public void setItems(List<Item> items) {
        this.wishlistItems = items;
    }

}
