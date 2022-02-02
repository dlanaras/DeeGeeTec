package DeeGeeTec_Modul226a.Main.Models.AbstractModels;

import java.util.List;

public abstract class Wishlist {

    public abstract int getWishlistId();

    public abstract void additemtowishlist(Item item);

    public abstract void removeItem(Item item);

    public abstract List<Item> getItems();

    public abstract void setItems(List<Item> items);

    public abstract void delete();
}

