package by.javatr.task2.logic;

public class DaysInMonthLogic {

    private DaysInMonthLogic() {}

    public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;

        private static final Month[] ENUMS = Month.values();

        public static Month of(int month) throws IllegalArgumentException{
            if (month < 1 || month > 12) {
                throw new IllegalArgumentException("Invalid value for MonthOfYear: " + month);
            }
            return ENUMS[month - 1];
        }

        private int monthLength(boolean leapYear) {
            switch (this) {
                case FEBRUARY:
                    return (leapYear ? 29 : 28);
                case APRIL:
                case JUNE:
                case SEPTEMBER:
                case NOVEMBER:
                    return 30;
                default:
                    return 31;
            }
        }
    }

    public static int daysCalculate(int inputYear, int inputMonth){
        boolean isLeap = leapYearCheck(inputYear);
        Month consideringMonth = Month.of(inputMonth);

        return consideringMonth.monthLength(isLeap);
    }

    public static boolean leapYearCheck(int prolepticYear) {
        return ((prolepticYear & 3) == 0) && ((prolepticYear % 100) != 0 || (prolepticYear % 400) == 0);
    }
}