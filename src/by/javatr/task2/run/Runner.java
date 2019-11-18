package by.javatr.task2.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task2.logic.DaysInMonthLogic;

import java.time.DateTimeException;

public class Runner {

    public static void main(String[] args) {

        int year, month;
        System.out.println("Введите желаемый год: ");
        year = DataScanner.enterIntegerFromConsole();
        System.out.println("Введите номер желаемого месяца: ");
        month = DataScanner.enterIntegerFromConsole();

        int daysNum;
        try {
            daysNum = DaysInMonthLogic.daysCalculate(year, month);
            System.out.println("Количество дней в этом месяце: " + daysNum);
        } catch (DateTimeException e) {
            System.out.println("Проверьте правильность ввода даты.");
        }

    }
}