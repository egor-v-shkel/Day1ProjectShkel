package by.javatr.task10.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task4.logic.EvenLogic;

public class Runner {

    public static void main(String[] args) {

        String input;
        int digitsNum = 4;
        System.out.printf("Введите последовательно %d целых числа через пробел.\n", digitsNum);
        input = DataScanner.enterLineFromConsole();

        boolean inputIsCorrect = EvenLogic.checkInputCorrectness(input);

        if (inputIsCorrect) {
            int[] ints = EvenLogic.parseInputToArray(input);
            System.out.println(EvenLogic.containEvenNumbers(ints));
        } else System.out.println("Проверьте правильность ввода.");
    }
}