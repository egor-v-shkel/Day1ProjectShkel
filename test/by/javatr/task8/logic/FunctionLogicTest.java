package by.javatr.task8.logic;

import org.junit.Assert;
import org.junit.Test;

public class FunctionLogicTest extends Assert {

    @Test
    public void calculateMore() {
        assertEquals(FunctionLogic.calculate(10), -61.0, 1E-1 );
    }

    @Test
    public void calculateLess() {
        assertEquals(FunctionLogic.calculate(-3), -0.03030303030303030, 1E-16 );
    }

    @Test
    public void calculateEquals() {
        assertEquals(FunctionLogic.calculate(3), 9.0, 1E-16 );
    }
}