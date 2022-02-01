package DeeGeeTec_Modul226a.Main.Models;

public abstract class Item {
    public abstract int getItemId();

    public abstract float getPrice();

    public abstract void setPrice(float price);

    public abstract String getItemName();

    public abstract void setItemName(String itemName);

    public abstract void delte();
}
