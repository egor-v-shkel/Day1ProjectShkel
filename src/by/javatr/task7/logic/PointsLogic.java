package by.javatr.task7.logic;

public class PointsLogic {
    public static void calculate(int[] A, int[] B){
        if (Math.sqrt(Math.pow(A[0], 2) + Math.pow(A[1], 2)) <
                Math.sqrt(Math.pow(B[0], 2) + Math.pow(B[1], 2))){
            System.out.println("first");
        } else System.out.println("Second");
    }
}
