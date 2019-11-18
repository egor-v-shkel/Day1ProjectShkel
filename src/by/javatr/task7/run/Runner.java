package by.javatr.task7.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task7.logic.PointsLogic;

import java.util.InputMismatchException;

public class Runner {

    public static void main(String[] args) {
        int[] inputA, inputB;

        try {
            System.out.println("Введите координаты точки A через пробел: ");
            inputA = DataScanner.enterIntArrayFromConsole();
            System.out.println("Введите координаты точки B через пробел: ");
            inputB = DataScanner.enterIntArrayFromConsole();

            PointsLogic.calculate(inputA, inputB);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}