package za.ac.cput;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;


/**
 *To test ComputerStore class
 * @Ziyaad
 * date:04/02/2021
 */

class ComputerStoreTest {

    //declaring variables
    private int hardrivePrice;
    private int hardrive2Price;
    private String Computer;
    private int ramPrice;
    private int motherboardPrice;

    public void setUp()  {
        hardrivePrice = 300;
        Computer = "300";
        ramPrice= 1000;
        motherboardPrice = 3000;
        hardrive2Price = hardrivePrice;
    }

    public void tearDown() throws Exception {
    }

    //testing equility
    @Test
    public void testEquity() {
        assertEquals(hardrivePrice, hardrivePrice);
    }

    @Test
    public void testIdentity() {
        assertSame(hardrivePrice,hardrivePrice);

    }

    //fail testing
    @Test
    public void testFail() {
        assertSame(hardrivePrice,Computer);
        System.out.println("this test fails");
    }

    //testing timeout
    @Timeout(1)
    @Test
    public void testTimeout() {
        for (int j=0; j<100000; j++) {
            System.out.println(j);
        }
    }

    @Disabled
    @Test
    public void testDisable() {
        assertEquals(hardrivePrice, hardrive2Price);
    }

}