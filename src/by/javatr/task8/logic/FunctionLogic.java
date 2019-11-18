package by.javatr.task8.logic;

public class FunctionLogic {

    public static double calculate(double x) {
        double func1 = -Math.pow(x, 2) + 3 * x + 9;
        double func2 = 1 / (Math.pow(x, 3) - 6);
        return (x >= 3) ? func1 : func2;
    }
}
