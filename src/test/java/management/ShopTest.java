package management;

import org.junit.Before;
import org.junit.Test;
import products.BassDrum;
import products.Cello;
import products.InstrumentType;
import products.Tuba;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Cello cello;
    Tuba tuba;
    BassDrum bassDrum;

    @Before
    public void setUp() throws Exception {
        shop = new Shop();
        cello = new Cello(120, 250, InstrumentType.STRING, 4);
        tuba = new Tuba(400, 600, InstrumentType.BRASS, 6);
        bassDrum = new BassDrum(200, 375, InstrumentType.PERCUSSION, 32);
    }

    @Test
    public void checkStockStartsEmpty() {
        assertEquals(0, shop.getSizeOfStock());
    }
    @Test
    public void canAddItemToStock() {
        shop.addItemToStock(cello);
        assertEquals(1, shop.getSizeOfStock());
    }
    @Test
    public void canRemoveItemFromStock() {
        shop.addItemToStock(tuba);
        shop.addItemToStock(bassDrum);
        shop.removeItemFromStock(tuba);
        assertEquals(1, shop.getSizeOfStock());
    }
}