package by.javatr.task3.logic;

public class CircleInscribedLogic {

    private static final double AREAS_DIFFERENCE = 2.0;

    private CircleInscribedLogic() {}

    public static double calculateInternalSquareArea(double squareArea) throws IllegalArgumentException {
        if (squareArea <= 0) throw new IllegalArgumentException("Проверьте правильность ввода: " + squareArea);

        return squareArea / AREAS_DIFFERENCE;
    }

    public static double getAreasDifference() {
        return AREAS_DIFFERENCE;
    }
}
