package by.javatr.task4.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task4.logic.CircleInscribedLogic;

public class Runner {

    public static void main(String[] args) {

        int outerSquareArea;
        System.out.println("Введите 4 числа через пробел");
        outerSquareArea = DataScanner.enterIntegerFromConsole();

        int innerSquareArea;
        innerSquareArea = CircleInscribedLogic.calculate(outerSquareArea);
        System.out.println("Площадь квадрата, вписанного в окружность: " + innerSquareArea);
        System.out.println("Площадь вписанного квадрата меньше площади заданного в 2 раза.");
    }
}