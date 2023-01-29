package products;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassDrumTest {

    BassDrum drum;

    @Before
    public void setUp() throws Exception {
        drum = new BassDrum(150, 250, InstrumentType.PERCUSSION, 28);
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(150, drum.getPurchasePrice(), 0.00);
    }
    @Test
    public void hasSellingPrice() {
        assertEquals(250, drum.getSellingPrice(), 0.00);
    }
    @Test
    public void canGetDiameter() {
        assertEquals(28, drum.getDiameter());
    }
    @Test
    public void hasType() {
        assertEquals(InstrumentType.PERCUSSION, drum.getType());
    }
    @Test
    public void canPlay() {
        assertEquals("Bass Drum goes: Boom", drum.play());
    }
}