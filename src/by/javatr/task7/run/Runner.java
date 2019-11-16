package by.javatr.task7.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task7.logic.PointsLogic;

public class Runner {

    public static void main(String[] args) {

        int[] inputA;
        System.out.println("Введите координаты точки A через пробел: ");
        inputA = DataScanner.enterIntArrayFromConsole();

        int[] inputB;
        System.out.println("Введите координаты точки B через пробел: ");
        inputB = DataScanner.enterIntArrayFromConsole();

        if ((inputA != null) && (inputB != null)) {
            PointsLogic.calculate(inputA, inputB);
        } else System.out.println("Проверьте правильность ввода.");
    }
}