package by.javatr.task5.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task5.logic.PerfectNumberLogic;

public class Runner {

    public static void main(String[] args) {

        int inputNum;
        System.out.println("Введите целое число: ");
        inputNum = DataScanner.enterIntegerFromConsole();

        System.out.println(PerfectNumberLogic.isPerfect(inputNum));
    }
}