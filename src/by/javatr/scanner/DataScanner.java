package by.javatr.scanner;

import java.util.Scanner;

public class DataScanner {

    @SuppressWarnings("resource")
    public static int enterIntegerFromConsole() {

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {
            sc.next();
        }

        return sc.nextInt();
    }

    @SuppressWarnings("resource")
    public static double enterDoubleFromConsole() {

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextDouble()) {
            sc.next();
        }

        return sc.nextDouble();
    }

    @SuppressWarnings("resource")
    public static int[] enterIntArrayFromConsole() throws NumberFormatException {

        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        boolean inputCorrect = checkInputCorrectness(inputStr);

        if (!inputCorrect) return null;
        return parseInputToArray(inputStr);
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

    private static boolean checkInputCorrectness(String input) {

        return input.matches("^(-?[0-9 ])+$");//TODO correct negative numbers match
    }

    @SuppressWarnings("resource")
    public static String enterLineFromConsole() {

        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }


}