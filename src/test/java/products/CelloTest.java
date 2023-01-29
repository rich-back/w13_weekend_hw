package products;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    Cello cello;

    @Before
    public void setUp() throws Exception {
        cello = new Cello(150, 250, InstrumentType.STRING, 4);
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(150, cello.getPurchasePrice(), 0.00);
    }
    @Test
    public void hasSellingPrice() {
        assertEquals(250, cello.getSellingPrice(), 0.00);
    }
    @Test
    public void canGetStringCount() {
        assertEquals(4, cello.getStringCount());
    }
    @Test
    public void hasType() {
        assertEquals(InstrumentType.STRING, cello.getType());
    }
    @Test
    public void canPlay() {
        assertEquals("Cello goes: Eeeee", cello.play());
    }
    @Test
    public void canGetMarkup() {
        assertEquals(100, cello.calculateMarkup(), 0.00);
    }
}
