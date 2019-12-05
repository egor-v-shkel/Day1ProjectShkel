package by.javatr.task5.logic;

public class PerfectNumberLogic {

    public static boolean isPerfect(int num) throws IllegalArgumentException {
        boolean notNatural;
        notNatural = naturalNumCheck(num);
        if (notNatural) throw new IllegalArgumentException("Введено ненатуральное число: " + num);

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return (sum == num && num != 0);
    }

    private static boolean naturalNumCheck(int num) {
        return (num < 0);
    }
}
