package management;

import products.Instrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public int getSizeOfStock() {
        return stock.size();
    }

    public void addItemToStock(Instrument instrument) {
        this.stock.add(instrument);
    }

    public void removeItemFromStock(Instrument instrument) {
        this.stock.remove(instrument);
    }
}
