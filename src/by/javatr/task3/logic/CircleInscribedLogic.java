package by.javatr.task3.logic;

public class CircleInscribedLogic {

    private static double areasDifference = 2.0;

    private CircleInscribedLogic() {}

    public static double calculateInternalSquareArea(double squareArea) throws IllegalArgumentException {
        if (squareArea <= 0) throw new IllegalArgumentException("Проверьте правильность ввода: " + squareArea);

        return squareArea / areasDifference;
    }

    public static double getAreasDifference() {
        return areasDifference;
    }
}
