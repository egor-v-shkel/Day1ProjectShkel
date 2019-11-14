package by.javatr.task1.run;

import by.javatr.scanner.DataScanner;
import by.javatr.task1.util.Logic;

public class Runner {

	public static void main(String... args) {
		
		int inputNum;
		System.out.println("Введите целое число: ");
		inputNum = DataScanner.enterIntegerFromConsole();

		int endNumSqr;
		endNumSqr = Logic.getLastDigitSqrt(inputNum);
		System.out.println("Последняя цифра квадрата введенного числа: " + endNumSqr);
	}
}