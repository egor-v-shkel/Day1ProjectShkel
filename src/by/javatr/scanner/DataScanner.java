package by.javatr.scanner;

import java.util.Scanner;

public class DataScanner {

	@SuppressWarnings("resource")
	public static int enterIntegerFromConsole(){

		Scanner sc = new Scanner(System.in);

		while(!sc.hasNextDouble()) {
			sc.next();
		}

		return sc.nextInt();
	}

	@SuppressWarnings("resource")
	public static double enterDoubleFromConsole(){

		Scanner sc = new Scanner(System.in);

		while(!sc.hasNextDouble()) {
			sc.next();
		}

		return sc.nextDouble();
	}
}