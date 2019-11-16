package by.javatr.task4.logic;

public class SomeLogic {

    public static boolean checkInputCorrectness(String input){

        return input.matches("^([-][0-9 ])+$");//TODO correct negative numbers match
    }

    public static int[] parseInputToArray(String input){

        String[] strArray = input.split(" ");
        int size = strArray.length;
        int [] arr = new int [size];
        for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
        return arr;
    }

    public static boolean containEvenNumbers(int[] array){

        int minQuantity = 2;
        int sum = 0;
        for (int i :
                array) {
            sum += i % 2;
        }
        return (sum <= minQuantity);
    }
}
