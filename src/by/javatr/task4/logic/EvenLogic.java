package by.javatr.task4.logic;

public class EvenLogic {

    private EvenLogic() {}

    public static boolean containEvenNumbers(int[] array) {
        int minQuantity = 2;
        int sum = 0;
        for (int i :
                array) {
            sum += Math.abs(i) % 2;
        }
        return (sum <= minQuantity);
    }

    public static boolean checkArraySize(int[] arr, int exactSize) {
        return (arr != null && arr.length == exactSize);
    }
}
