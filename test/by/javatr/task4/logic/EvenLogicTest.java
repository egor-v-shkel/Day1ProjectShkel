package by.javatr.task4.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenLogicTest {

    @Test
    public void containEvenNumbersTrue() {
        int [] arr = new int[]{1, 2, 3, 4};
        boolean actual = EvenLogic.containEvenNumbers(arr);
        assertTrue(actual);
    }

    @Test
    public void containEvenNumbersFalse() {
        int [] arr = new int[]{1, 1, 1, 1};
        boolean actual = EvenLogic.containEvenNumbers(arr);
        assertFalse(actual);
    }

    @Test
    public void containEvenNumbersLessThanMinQuantity() {
        int [] arr = new int[]{1, 2, 1, 1};
        boolean actual = EvenLogic.containEvenNumbers(arr);
        assertFalse(actual);
    }

    @Test
    public void checkArraySizeLess() {
        int[] arr = new int[0];
        assertFalse(EvenLogic.checkArraySize(arr, 4));
    }

    @Test
    public void checkArraySizeMore() {
        int[] arr = new int[5];
        assertFalse(EvenLogic.checkArraySize(arr, 4));
    }

    @Test
    public void checkArraySizeExact() {
        int[] arr = new int[4];
        assertTrue(EvenLogic.checkArraySize(arr, 4));
    }
}