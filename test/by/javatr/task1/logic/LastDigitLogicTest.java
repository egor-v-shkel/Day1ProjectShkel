package by.javatr.task1.logic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LastDigitLogicTest extends Assert {
    private static List<Integer> expectedList;

    @Before
    public void fillExpectedList() {
        int[] data = new int[]{0, 1, 4, 9, 6, 5, 6, 9, 4, 1, 0, 1, 4, 9, 6, 5, 6, 9, 4, 1, 0};
        expectedList = new ArrayList<>(data.length);
        for (int i : data) {
            expectedList.add(i);
        }
    }

    @Test
    public void getLastDigitSqrtTest() {
        List<Integer> resultList = new ArrayList<>(expectedList.size());
        for (int i = -10; i < 11; i++) {
            int methodResult = LastDigitLogic.getLastDigitSqrt(i);
            resultList.add(methodResult);
        }
        assertEquals(resultList, expectedList);
    }
}