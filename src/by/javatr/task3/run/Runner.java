package by.javatr.task3.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task3.logic.CircleInscribedLogic;

public class Runner {

    public static void main(String[] args) {

        double outerSquareArea;
        double areaDifference;
        System.out.println("Введите площадь квадрата, в который вписана окружность: ");
        outerSquareArea = DataScanner.enterDoubleFromConsole();

        try {
            double internalSquareArea;
            internalSquareArea = CircleInscribedLogic.calculateInternalSquareArea(outerSquareArea);
            System.out.println("Площадь квадрата, вписанного в окружность: " + internalSquareArea);
            areaDifference = CircleInscribedLogic.getAreasDifference();
            String message = String
                    .format("Площадь вписанного квадрата меньше площади заданного в %.1f раза.", areaDifference);
            System.out.println(message);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}