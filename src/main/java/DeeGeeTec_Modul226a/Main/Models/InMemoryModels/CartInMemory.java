package DeeGeeTec_Modul226a.Main.Models.InMemoryModels;

import java.util.ArrayList;
import java.util.List;

import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Cart;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;

public class CartInMemory extends Cart {

    private static final ArrayList<CartInMemory> carts = new ArrayList<>();
    private List<Item> cartItems = new ArrayList<>();
    private static int cartId;


    public CartInMemory(List<Item> items) {
        this.cartItems = items;
        carts.add(this);
        cartId++;
    }

    @Override
    public int getCartId() { 
        return cartId;
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
