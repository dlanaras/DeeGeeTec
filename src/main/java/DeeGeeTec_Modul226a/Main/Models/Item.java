package DeeGeeTec_Modul226a.Main.Models;

public class Item {
    private String itemName;
    private float price;
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
