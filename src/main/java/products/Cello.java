package products;

public class Cello extends Instrument {

    private int stringCount;
    public Cello(double purchasePrice, double sellingPrice, InstrumentType type, int stringCount) {
        super(purchasePrice, sellingPrice, type);
        this.stringCount = stringCount;
    }

    public int getStringCount() {
        return stringCount;
    }

    public String play() {
        return "Cello goes: Eeeee";
    }
}
