package products;

public abstract class Instrument implements IPlay{

    private double purchasePrice;
    private double sellingPrice;

    private InstrumentType type;

    public Instrument(double purchasePrice, double sellingPrice, InstrumentType type) {
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.type = type;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public InstrumentType getType() {
        return type;
    }


}
