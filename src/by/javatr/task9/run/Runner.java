package by.javatr.task9.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task9.logic.CircleLogic;

public class Runner {

    public static void main(String[] args) {

        double r;
        System.out.println("Введите значение радиуса r: ");
        r = DataScanner.enterDoubleFromConsole();

        double circumference = CircleLogic.circumference(r);
        double area = CircleLogic.area(r);

        System.out.printf("Длинна окружности: %f. Площадь: %f", circumference, area);
    }
}