package by.javatr.task8.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task8.logic.FunctionLogic;

public class Runner {

    public static void main(String[] args) {
        double x;
        System.out.println("Введите значение х: ");
        x = DataScanner.enterDoubleFromConsole();

        double y = FunctionLogic.calculate(x);
        System.out.println("Ответ: " + y);
    }
}