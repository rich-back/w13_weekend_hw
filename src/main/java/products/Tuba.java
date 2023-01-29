package products;

public class Tuba extends Instrument {

    private int valveCount;

    public Tuba(double purchasePrice, double sellingPrice, InstrumentType type, int valveCount) {
        super(purchasePrice, sellingPrice, type);
        this.valveCount = valveCount;
    }

    public int getValveCount() {
        return valveCount;
    }

    public String play() {
        return "Tuba goes: Oom-pah";
    }
}