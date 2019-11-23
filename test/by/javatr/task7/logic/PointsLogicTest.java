package by.javatr.task7.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointsLogicTest {

    @Test
    public void calculatePositiveDot() {
        String actual = PointsLogic.calculate(new int[]{1, 2}, new int[]{3, 4});
        assertEquals("first", actual);
    }

    @Test
    public void calculateNegativeDot() {
        String actual = PointsLogic.calculate(new int[]{-1, -2}, new int[]{-3, -4});
        assertEquals("first", actual);
    }

    @Test
    public void calculateMixedDot() {
        String actual = PointsLogic.calculate(new int[]{-2, 4}, new int[]{-1, 3});
        assertEquals("second", actual);
    }
}