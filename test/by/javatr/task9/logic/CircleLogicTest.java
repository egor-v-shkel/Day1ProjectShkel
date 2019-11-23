package by.javatr.task9.logic;

import by.javatr.task3.logic.CircleInscribedLogic;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleLogicTest {

    @Test
    public void circumference() {
        assertEquals(62.83185307179586, CircleLogic.circumference(10.0), 1E-12);
    }

    @Test
    public void area() {
        assertEquals(314.1592653589793, CircleLogic.area(10.0), 1E-12);
    }
}