package by.javatr.task6.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeDeterminationLogicTest {

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