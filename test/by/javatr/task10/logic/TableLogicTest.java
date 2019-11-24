package by.javatr.task10.logic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TableLogicTest extends Assert {

    private double[][] expected;

    @Before
    public void setupExpectedArray() {
        expected = new double[][]{{1.0, 1.1, 1.2, 1.3, 1.4, 1.5}, {1.557, 1.964, 2.572, 3.602, 5.798, 14.101}};
    }

    @Test
    public void calculate() {
        double[][] actual = TableLogic.calculate(1.0, 1.5, 0.1);
        for (int i = 0; i < actual.length; i++) {
            assertArrayEquals(expected[i], actual[i], 1E-3);
        }
    }
}