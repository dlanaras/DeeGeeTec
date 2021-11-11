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

    public void addWishlistItems(Item item) { this.wishlistItems.add(item);}

    public void removeItem(Item item) { this.wishlistItems.remove(item); }

    public List<Item> getItems() {
        return wishlistItems;
    }

    public void setItems(List<Item> items) {
        this.wishlistItems = items;
    }

}
