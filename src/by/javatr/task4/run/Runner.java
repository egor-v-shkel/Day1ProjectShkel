package by.javatr.task4.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task4.logic.SomeLogic;

public class Runner {

    public static void main(String[] args) {

        String input;
        int digitsNum = 4;
        System.out.printf("Введите последовательно %d целых числа через пробел.\n", digitsNum);
        input = DataScanner.enterLineFromConsole();

        boolean inputIsCorrect = SomeLogic.checkInputCorrectness(input);

        if (inputIsCorrect) {
            int[] ints = SomeLogic.parseInputToArray(input);
            System.out.println(SomeLogic.containEvenNumbers(ints));
        } else System.out.println("Проверьте правильность ввода.");
    }
}