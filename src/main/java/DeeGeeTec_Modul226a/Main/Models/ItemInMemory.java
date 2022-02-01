package DeeGeeTec_Modul226a.Main.Models;

import java.util.ArrayList;

public class ItemInMemory extends Item {

    private static final ArrayList<ItemInMemory> items = new ArrayList<>(); 

    private String itemName;
    private float price;
    private int itemId;

    public ItemInMemory(String itemName, float price) {
        this.itemName = itemName;
        this.price = price;
        items.add(this);
    }

    @Override
    public int getItemId() {
        return this.itemId;
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
