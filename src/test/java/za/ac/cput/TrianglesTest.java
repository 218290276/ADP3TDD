/*
 * 4 January
 * ADP3 - Test Driven Development
 * Tyler Yorke Fredericks - 218047894
 */

package za.ac.cput;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;


public class TrianglesTest {

    private String RightTriangle;
    private String AcuteTriangle;
    private String Triangle;
    private int num;

    public void setUp()
    {
        RightTriangle = "Triangle A";
        AcuteTriangle = "Triangle B";
        Triangle = RightTriangle;
        num = 1;
    }

    public void tearDown() throws Exception
    {

    }

    //Test Object Equality
    @Test
    public void testEquality()
    {
        assertEquals(RightTriangle, RightTriangle);
    }

    //Test Object Identity
    @Test
    public void testIdentity()
    {
        assertSame(RightTriangle,Triangle);
    }

    //Test Failing Test
    @Test
    public void testFail()
    {
        System.out.println("Task failed successfully.");
        assertSame(RightTriangle,num);

    }

    //Test Timeouts
    @Test
    @Timeout(10)
    public void testTimeout() throws InterruptedException
    {
        Thread.sleep(1000);
    }

    //Test Disabling Test
    @Disabled
    @Test
    public void testDisable()
    {
        assertEquals(Triangle,RightTriangle);
    }

}
