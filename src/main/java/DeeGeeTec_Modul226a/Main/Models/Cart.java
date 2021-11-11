package DeeGeeTec_Modul226a.Main.Models;

import java.util.List;

public class Cart {
    /**
     * This int contains the Id of the Cart
     */
    private int cartId;
    /**
     * This is a List with all the Items in the shoppingcart
     */
    private List<Item> cartItems;

    public int getCartId() { return this.cartId; }

    public List<Item> getItems() {
        return this.cartItems;
    }

    public void setItems(List<Item> items) {
        this.cartItems = items;
    }
    
    public void addItem(Item item) {
        this.cartItems.add(item);
    }

    public void removeItem(Item item) {this.cartItems.remove(item);}

}
