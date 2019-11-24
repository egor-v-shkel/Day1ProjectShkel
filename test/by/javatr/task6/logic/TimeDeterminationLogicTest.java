package by.javatr.task6.logic;

import org.junit.Assert;
import org.junit.Test;

public class TimeDeterminationLogicTest extends Assert {

    @Test
    public void calculate() {
        int[] expected = {1, 1};
        int[] actual = TimeDeterminationLogic.calculate(3660);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void calculateZero() {
        int[] expected = {0, 0};
        int[] actual = TimeDeterminationLogic.calculate(0);
        assertArrayEquals(expected, actual);
    }
}