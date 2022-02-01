package DeeGeeTec_Modul226a.Main.Models;

import java.util.ArrayList;
import java.util.List;

public class WishlistInMemory extends Wishlist {

    private static final ArrayList<WishlistInMemory> wishlists = new ArrayList<>();

    private List<Item> wishlistItems;
    private int wishlistId;

    public WishlistInMemory(List<Item> wishlistItems) {
        this.wishlistItems = wishlistItems;
        wishlists.add(this);
    }

    @Override
    public int getWishlistId() {
        return this.wishlistId;
    }

    @Override
    public void addWishlistItems(Item item) {
        this.wishlistItems.add(item);
    }

    @Override
    public void removeItem(Item item) {
        this.wishlistItems.remove(item);
    }

    @Override
    public List<Item> getItems() {
        return wishlistItems;
    }

    @Override
    public void setItems(List<Item> items) {
        this.wishlistItems = items;
    }

    @Override
    public void delete() {
        wishlists.remove(this);
    }

}
