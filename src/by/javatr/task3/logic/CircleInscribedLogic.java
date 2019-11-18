package by.javatr.task3.logic;

public class CircleInscribedLogic {

    public static double calculate(double squareArea) throws IllegalArgumentException {
        if (squareArea <= 0) throw new IllegalArgumentException("Проверьте правильность ввода");

        return squareArea / 2;
    }
}
