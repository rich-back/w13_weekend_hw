package products;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TubaTest {

    Tuba tuba;

    @Before
    public void setUp() throws Exception {
        tuba = new Tuba(150, 250, InstrumentType.BRASS, 3);
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(150, tuba.getPurchasePrice(), 0.00);
    }
    @Test
    public void hasSellingPrice() {
        assertEquals(250, tuba.getSellingPrice(), 0.00);
    }
    @Test
    public void canGetValveCount() {
        assertEquals(3, tuba.getValveCount());
    }
    @Test
    public void hasType() {
        assertEquals(InstrumentType.BRASS, tuba.getType());
    }
    @Test
    public void canPlay() {
        assertEquals("Tuba goes: Oom-pah", tuba.play());
    }
}
