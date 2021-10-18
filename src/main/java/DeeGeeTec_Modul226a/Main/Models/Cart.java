package DeeGeeTec_Modul226a.Main.Models;

import java.util.List;

public class Cart {
    private List<Item> cartItems;

    public List<Item> getItems() {
        return cartItems;
    }

    public void setItems(List<Item> items) {
        this.cartItems = items;
    }

    public void addItem(Item itemToAdd){
        //adds am Item to the Cart
        cartItems.add(itemToAdd);
    };
}
