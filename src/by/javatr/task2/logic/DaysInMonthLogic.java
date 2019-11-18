package by.javatr.task2.logic;

import java.time.DateTimeException;
import java.time.YearMonth;

public class DaysInMonthLogic {

    public static int daysCalculate(int year, int month) throws DateTimeException {
        YearMonth yearMonthObj = YearMonth.of(year, month);
        int daysInMonth;
        daysInMonth = yearMonthObj.lengthOfMonth();
        return daysInMonth;
    }
}