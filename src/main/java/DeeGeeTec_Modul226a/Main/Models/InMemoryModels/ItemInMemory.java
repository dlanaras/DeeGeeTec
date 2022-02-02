package DeeGeeTec_Modul226a.Main.Models.InMemoryModels;

import java.util.ArrayList;

import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;

public class ItemInMemory extends Item {

    private static final ArrayList<ItemInMemory> items = new ArrayList<>(); 

    private String itemName;
    private float price;
    private static int itemId;

    public ItemInMemory(String itemName, float price) {
        this.itemName = itemName;
        this.price = price;
        items.add(this);
        itemId++;
    }

    @Override
    public int getItemId() {
        return itemId;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public void delte() {
        items.remove(this);
    }
}
