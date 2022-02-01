package DeeGeeTec_Modul226a.Main.Models;

public class ItemJdbc extends Item {
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

    public ItemJdbc(String itemName, float price) {
        this.itemName = itemName;
        this.price = price;

        //... add this to db
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
        // TODO Auto-generated method stub
        
    }
}
