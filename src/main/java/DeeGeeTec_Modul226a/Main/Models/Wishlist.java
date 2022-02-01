package DeeGeeTec_Modul226a.Main.Models;

import java.util.List;

public abstract class Wishlist {
 
    public abstract int getWishlistId();

    public abstract void addWishlistItems(Item item);

    public abstract void removeItem(Item item);

    public abstract List<Item> getItems();

    public abstract void setItems(List<Item> items);

    public abstract void delete();
}
