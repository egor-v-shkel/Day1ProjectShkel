package by.javatr.task7.logic;

import org.junit.Assert;
import org.junit.Test;

public class PointsLogicTest extends Assert {

    @Test
    public void calculatePositiveDot() {
        int[] pointA = {1, 2};
        int[] pointB = {3, 4};

        int[] actual = PointsLogic.closest2DPoint(pointA, pointB);
        assertArrayEquals(pointA, actual);
    }

    @Test
    public void calculateNegativeDot() {
        int[] pointA = {-1, -2};
        int[] pointB = {-3, -4};

        int[] actual = PointsLogic.closest2DPoint(pointA, pointB);
        assertEquals(pointA, actual);
    }

    @Test
    public void calculateMixedDot() {
        int[] pointA = {-2, 4};
        int[] pointB = {-1, 3};

        int[] actual = PointsLogic.closest2DPoint(pointA, pointB);
        assertEquals(pointB, actual);
    }
}