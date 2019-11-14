package by.javatr.task2.logic;

import java.time.YearMonth;

public class DaysInMonthLogic {

    public static int daysCalculate(int year, int month){

        YearMonth yearMonthObj = YearMonth.of(year, month);
        int daysInMonth;
        daysInMonth = yearMonthObj.lengthOfMonth();

        return daysInMonth;
    }

    public static boolean checkInput(int month){

        return ((month >= 1) && (month <= 12));
    }
}