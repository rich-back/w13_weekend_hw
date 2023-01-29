package products;

public class BassDrum extends Instrument{

    private int diameter;

    public BassDrum(double purchasePrice, double sellingPrice, InstrumentType type, int diameter) {
        super(purchasePrice, sellingPrice, type);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public String play() {
        return "Bass Drum goes: Boom";
    }
}
