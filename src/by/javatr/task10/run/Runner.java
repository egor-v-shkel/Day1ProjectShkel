package by.javatr.task10.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task10.logic.TableLogic;

public class Runner {

    public static void main(String[] args) {

        double a, b, h;
        System.out.println("Введите значения начала отрезка: ");
        a = DataScanner.enterDoubleFromConsole();
        System.out.println("Введите значения конца отрезка: ");
        b = DataScanner.enterDoubleFromConsole();
        System.out.println("Введите шаг вычисления значений h: ");
        h = DataScanner.enterDoubleFromConsole();

        double[][] output = TableLogic.calculate(a, b, h);

        String result = TableLogic.createTable(output);
        System.out.println(result);
    }
}