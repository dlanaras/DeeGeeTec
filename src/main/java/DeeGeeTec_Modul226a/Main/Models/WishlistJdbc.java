package DeeGeeTec_Modul226a.Main.Models;

import java.util.List;

public class WishlistJdbc extends Wishlist {
    /**
     * A list of all items in the wishlist
     */
    private List<Item> wishlistItems;
    /**
     * ID of the wishlist
     */
    private int wishlistId;

    public WishlistJdbc(List<Item> wishlistItems) {
        this.wishlistItems = wishlistItems;

        //... add it to db
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
        // TODO Auto-generated method stub
        
    }

}
