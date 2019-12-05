package by.javatr.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataScanner {

    private DataScanner() {}

    public static int enterIntegerFromConsole() {

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {
            sc.next();
        }

        return sc.nextInt();
    }

    public static int enterNotNegativeIntegerFromConsole() {
        int temp;
        do {
            temp = enterIntegerFromConsole();
        } while (temp < 0);

        return temp;
    }

    public static double enterDoubleFromConsole() {

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextDouble()) {
            sc.next();
        }

        return sc.nextDouble();
    }

    public static double enterNotNegativeDoubleFromConsole() {
        double temp;
        do {
            temp = enterDoubleFromConsole();
        } while (temp < 0);

        return temp;
    }

    public static int[] enterIntArrayFromConsole() throws InputMismatchException {

        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        boolean inputCorrect = checkInputArrayCorrectness(inputStr);
        if (!inputCorrect) throw new InputMismatchException("Проверьте правильность ввода.");

        return parseInputToArray(inputStr);
    }



    private static boolean checkInputArrayCorrectness(String input) {

        return input.matches("[-?\\d]+(?: -?\\d+)*");
    }

    private static int[] parseInputToArray(String input) {

        String[] strArray = input.split(" ");
        int size = strArray.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
        return arr;
    }

    public static String enterLineFromConsole() {

        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }


}