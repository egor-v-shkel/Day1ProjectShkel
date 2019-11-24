package by.javatr.task9.logic;

import org.junit.Assert;
import org.junit.Test;

public class CircleLogicTest extends Assert {

    @Test
    public void circumference() {
        assertEquals(62.83185307179586, CircleLogic.circumference(10.0), 1E-12);
    }

    @Test
    public void area() {
        assertEquals(314.1592653589793, CircleLogic.area(10.0), 1E-12);
    }
}