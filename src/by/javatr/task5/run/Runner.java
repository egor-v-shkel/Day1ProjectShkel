package by.javatr.task5.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task5.logic.PerfectNumberLogic;

public class Runner {

    public static void main(String[] args) {
        int inputNum;
        System.out.println("Введите целое натуральное число: ");
        inputNum = DataScanner.enterIntegerFromConsole();

        boolean hasPerfect = false;
        try {
            hasPerfect = PerfectNumberLogic.isPerfect(inputNum);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(hasPerfect);
    }
}