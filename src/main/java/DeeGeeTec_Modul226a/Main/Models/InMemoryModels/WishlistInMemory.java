package DeeGeeTec_Modul226a.Main.Models.InMemoryModels;

import java.util.ArrayList;
import java.util.List;

import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Wishlist;

public class WishlistInMemory extends Wishlist {

    private static final ArrayList<WishlistInMemory> wishlists = new ArrayList<>();

    private List<Item> wishlistItems;
    private static int wishlistId;

    public WishlistInMemory(List<Item> wishlistItems) {
        this.wishlistItems = wishlistItems;
        wishlists.add(this);
        wishlistId++;
    }

    @Override
    public int getWishlistId() {
        return wishlistId;
    }

    @Override
    public void additemtowishlist(Item item) {
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
