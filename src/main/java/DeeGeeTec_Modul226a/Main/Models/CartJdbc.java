package DeeGeeTec_Modul226a.Main.Models;

import java.util.List;

public class CartJdbc extends Cart {
    /**
     * This int contains the Id of the Cart
     */
    private int cartId;
    /**
     * This is a List with all the Items in the shoppingcart
     */
    private List<Item> cartItems;

    public CartJdbc(List<Item> items) {
        this.cartItems = items;

        //... add it to db
    }

    @Override
    public int getCartId() { 
        return this.cartId;
    }

    @Override
    public List<Item> getItems() {
        return this.cartItems;
    }

    @Override
    public void setItems(List<Item> items) {
        this.cartItems = items;
    }
    
    @Override
    public void addItem(Item item) {
        this.cartItems.add(item);
    }

    @Override
    public void removeItem(Item item) {
        this.cartItems.remove(item);
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        
    }

}
