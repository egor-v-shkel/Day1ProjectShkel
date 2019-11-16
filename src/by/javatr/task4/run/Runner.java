package by.javatr.task4.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task4.logic.SomeLogic;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        int[] input;
        int digitsNum = 4;
        System.out.printf("Введите последовательно %d целых числа через пробел.\n", digitsNum);
        //input = DataScanner.enterIntArrayFromConsole();

        //System.out.println(Arrays.toString(input));
        System.out.println(SomeLogic.calculate(5));
    }
}