package by.javatr.task3.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task3.logic.CircleInscribedLogic;

public class Runner {

    public static void main(String[] args) {

        double outerSquareArea;
        System.out.println("Введите площадь квадрата, в который вписана окружность: ");
        outerSquareArea = DataScanner.enterDoubleFromConsole();

        try {
            double innerSquareArea;
            innerSquareArea = CircleInscribedLogic.calculate(outerSquareArea);
            System.out.println("Площадь квадрата, вписанного в окружность: " + innerSquareArea);
            System.out.println("Площадь вписанного квадрата меньше площади заданного в 2 раза.");
        } catch (IllegalArgumentException e) {
            System.out.println("Проверьте правильность ввода.");
        }
    }
}