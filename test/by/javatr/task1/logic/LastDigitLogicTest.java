package by.javatr.task1.logic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LastDigitLogicTest extends Assert {
    private int[] expected;

    @Before
    public void setupExpectedArr() {
        expected = new int[]{0, 1, 4, 9, 6, 5, 6, 9, 4, 1, 0, 1, 4, 9, 6, 5, 6, 9, 4, 1, 0};
    }

    @Test
    public void getLastDigitSqrtTest() {
        int[] actual = new int[21];
        for (int i = -10; i < 11; i++) {
            int result = LastDigitLogic.getLastDigitSqrt(i);
            actual[i+10] = result;
        }
        assertArrayEquals(expected, actual);
    }
}