package by.javatr.task4.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task4.logic.EvenLogic;

import java.util.InputMismatchException;

public class Runner {

    public static void main(String[] args) {

        final int ARRAY_SIZE = 4;
        System.out.printf("Введите последовательно %d целых числа через пробел.\n", ARRAY_SIZE);

        int[] arrayFromConsole = null;
        try {
             arrayFromConsole = DataScanner.enterIntArrayFromConsole();
        } catch (InputMismatchException e) {
            System.out.println("Проверьте правильность ввода.");
        }

        boolean correctSize = EvenLogic.checkArraySize(arrayFromConsole, ARRAY_SIZE);
        if (correctSize) {
            boolean contains = EvenLogic.containEvenNumbers(arrayFromConsole);
            System.out.println(contains);
        } else
            System.out.println("Проверьте количество введенных чисел.");
    }
}