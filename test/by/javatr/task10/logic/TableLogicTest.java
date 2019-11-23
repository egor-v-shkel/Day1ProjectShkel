package by.javatr.task10.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class TableLogicTest {

    //TODO add correct test
    @Test
    public void calculate() {
        double[][] expected = { {1.0, 1.1, 1.2000000000000002, 1.3000000000000003} , { 1.55, 1.94, 2.57, 3.6} };

        assertArrayEquals(expected, TableLogic.calculate(1.0, 1.4, 0.1));
    }
}