package csc402.assignment1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class HW1Test 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testSum() {
        assertEquals(0, HW1.sum(new double[0]), 0.001);
        assertEquals(3, HW1.sum(new double[] {1, 2}), 0.001);
    }

    @Test
    public void testMinValue() {
        assertEquals(-7, HW1.minValue(new double[] { -7 }), 0.001);
        assertEquals(-7, HW1.minValue(new double[] { 1, -4, -7, 7, 8, 11 }), 0.001);
        assertEquals(-13, HW1.minValue(new double[] { -13, -4, -7, 7, 8, 11 }), 0.001);
        assertEquals(-9, HW1.minValue(new double[] { 1, -4, -7, 7, 8, 11, -9 }), 0.001);
    }

    @Test
    public void testMinPosition() {
        assertEquals(0, HW1.minPosition(new double[] { -7 }));
        assertEquals(2, HW1.minPosition(new double[] { 1, -4, -7, 7, 8, 11 }));
        assertEquals(0, HW1.minPosition(new double[] { -13, -4, -7, 7, 8, 11 }));
        assertEquals(6, HW1.minPosition(new double[] { 1, -4, -7, 7, 8, 11, -9 }));
    }

    @Test
    public void testDistanceBetweenMinAndMax() {
        assertEquals(0, HW1.distanceBetweenMinAndMax(new double[] { -7 }));
        assertEquals(3, HW1.distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11 }));
        assertEquals(5, HW1.distanceBetweenMinAndMax(new double[] { -13, -4, -7, 7, 8, 11 }));
        assertEquals(1, HW1.distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11, -9 }));
    }

    @Test
    public void testNumUnique() {
        assertEquals(0, HW1.numUnique(new double[] { }));
        assertEquals(1, HW1.numUnique(new double[] { 11 }));
        assertEquals(1, HW1.numUnique(new double[] { 11, 11, 11, 11 }));
        assertEquals(8, HW1.numUnique(new double[] { 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 }));
        assertEquals(8, HW1.numUnique(new double[] { 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88 }));
    }

    @Test
    public void testRemoveDuplicates() {
        assertArrayEquals(new double[] { }, HW1.removeDuplicates(new double[] { }), 0.001);
        assertArrayEquals(new double[] { 11 }, HW1.removeDuplicates(new double[] { 11 }), 0.001);
        assertArrayEquals(new double[] { 11 }, HW1.removeDuplicates(new double[] { 11, 11, 11, 11 }), 0.001);
        assertArrayEquals(new double[] { 11, 22, 33, 44, 55, 66, 77, 88 }, HW1.removeDuplicates(new double[] { 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 }), 0.001);
        assertArrayEquals(new double[] { 11, 22, 33, 44, 55, 66, 77, 88 }, HW1.removeDuplicates(new double[] { 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88 }), 0.001);
    }
}
