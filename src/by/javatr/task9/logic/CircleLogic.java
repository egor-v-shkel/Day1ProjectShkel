package by.javatr.task9.logic;

public class CircleLogic {

    private CircleLogic() {}

    public static double circumference(double radius) {
        return (2 * Math.PI * radius);
    }

    public static double area(double radius) {
        return (Math.PI * Math.pow(radius, 2));
    }
}
