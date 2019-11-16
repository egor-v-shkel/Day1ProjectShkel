package by.javatr.task6.logic;

public class TimeDeterminationLogic {

    public static int[] calculate(int second) {

        int hour = second/3600;
        int minute = (second-(hour*3600))/60;

        int[] time = {hour, minute};
        return time;
    }
}
