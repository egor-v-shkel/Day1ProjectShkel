package by.javatr.task2.logic;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class DaysInMonthLogicTest {
    private static final Random rnd = new Random();

    @Test
    public void daysCalculateFebruaryCommonYear() {
        int actual = DaysInMonthLogic.daysCalculate(1400, 2);
        assertEquals(28, actual);
    }

    @Test
    public void daysCalculateFebruaryLeapYear() {
        int actual = DaysInMonthLogic.daysCalculate(2000, 2);
        assertEquals(29, actual);
    }

    @Test
    public void daysCalculateOtherMonth() {
        int testMonth = 1;
        //skip february
        do {
            testMonth = rnd.nextInt(11) + 1;
        } while (testMonth == 2);

        int expected;
        switch (testMonth) {
            case 4:
            case 6:
            case 9:
            case 11:
                expected =  30;
                break;
            default:
                expected =  31;
        }
        int actual = DaysInMonthLogic.daysCalculate(2000, testMonth);

        assertEquals(expected, actual);
    }
}