package by.javatr.task2.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task2.logic.DaysInMonthLogic;

public class Runner {

    public static void main(String[] args) {

        int year, month;
        System.out.println("Введите желаемый год: ");
        year = DataScanner.enterIntegerFromConsole();
        System.out.println("Введите желаемый месяц: ");
        month = DataScanner.enterIntegerFromConsole();

        DaysInMonthLogic.checkInput(month);

        int daysNum;
        daysNum = DaysInMonthLogic.daysCalculate(year, month);
        System.out.println("Количество дней в этом месяце: "+daysNum);
    }
}