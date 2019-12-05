package by.javatr.task3.logic;

public class CircleInscribedLogic {

    private CircleInscribedLogic() {}

    public static double calculate(double squareArea) throws IllegalArgumentException {
        if (squareArea <= 0) throw new IllegalArgumentException("Проверьте правильность ввода: " + squareArea);

        return squareArea / 2;
    }
}
