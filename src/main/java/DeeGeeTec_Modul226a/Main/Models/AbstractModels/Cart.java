package DeeGeeTec_Modul226a.Main.Models.AbstractModels;

import java.util.List;

public abstract class Cart {

    public abstract int getCartId();

    public abstract List<Item> getItems();

    public abstract void setItems(List<Item> items);
    
    public abstract void addItem(Item item);

    public abstract void removeItem(Item item);

    public abstract void delete();

}
