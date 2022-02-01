package DeeGeeTec_Modul226a.Main.Models;

import java.util.ArrayList;
import java.util.List;

public class CartInMemory extends Cart {

    private static final ArrayList<CartInMemory> carts = new ArrayList<>();
    private List<Item> cartItems = new ArrayList<>();
    private int cartId;


    public CartInMemory(List<Item> items) {
        this.cartItems = items;
        carts.add(this);
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
        carts.remove(this);        
    }

}
