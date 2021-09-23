package DeeGeeTec_Modul226a.Main;

import java.util.List;

public class Cart {
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void FillCartUsingWishlist(List<Item> wishlist){
        if(!wishlist.isEmpty())
        {
            this.items.addAll(wishlist);
        }
    }

}
