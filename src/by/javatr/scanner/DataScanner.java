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
        String[] strArray = sc.nextLine().split(" ");
        int strArrayLength = strArray.length;
        int[] intArray = new int[strArrayLength];
        for (int i = 0; i < strArrayLength; i++) {
            if (sc.hasNextInt()) {
                intArray[i] = sc.nextInt();
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        return intArray;
    }

    @SuppressWarnings("resource")
    public static String enterLineFromConsole() {

        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }


}