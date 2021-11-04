package DeeGeeTec_Modul226a.Main.Models;

public class Item {
    /**
     * This string contains the Name of the Item
     */
    private String itemName;
    /**
     * This float contains the Price of an Item
     */
    private float price;
    /**
     * This Int contains the ID of the Item
     */
    private int itemId;

    public int getItemId() { return this.itemId; }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
