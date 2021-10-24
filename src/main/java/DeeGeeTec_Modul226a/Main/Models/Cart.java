package DeeGeeTec_Modul226a.Main.Models;

import java.util.List;

public class Cart {
    private int cartId;
    private List<Item> cartItems;

    public int getCartId() { return this.cartId; }

    public List<Item> getItems() {
        return this.cartItems;
    }

    public void setItems(List<Item> items) {
        this.cartItems = items;
    }

    public void addItem(Item itemToAdd){
        //adds am Item to the Cart
        this.cartItems.add(itemToAdd);
    };
}
