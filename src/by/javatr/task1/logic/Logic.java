package by.javatr.task1.logic;

public class Logic {

    public static int getLastDigitSqrt(int num) {

        int lastDigit = num%10;
        int lastDigitSqrt = 0;

        switch (lastDigit) {
            case (1):
            case (9):
                lastDigitSqrt = 1;
                break;
            case (2):
            case (8):
                lastDigitSqrt = 4;
                break;
            case (3):
            case (7):
                lastDigitSqrt = 9;
                break;
            case (4):
            case (6):
                lastDigitSqrt = 6;
                break;
            case (5):
                lastDigitSqrt = 5;
                break;
        }

        return lastDigitSqrt;
    }
}