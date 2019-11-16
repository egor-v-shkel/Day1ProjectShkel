package by.javatr.task6.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task4.logic.EvenLogic;
import by.javatr.task6.logic.TimeDeterminationLogic;

public class Runner {

    public static void main(String[] args) {

        int inputNum;
        System.out.println("Введите количество секунд с начала суток: ");
        inputNum = DataScanner.enterIntegerFromConsole();

        int[] time = TimeDeterminationLogic.calculate(inputNum);
        System.out.printf("Количество часов %d, количество минут %d", time[0], time[1]);

    }
}