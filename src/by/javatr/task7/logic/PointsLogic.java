package by.javatr.task7.logic;

public class PointsLogic {
    public static String calculate(int[] A, int[] B){
        return  (Math.sqrt(Math.pow(A[0], 2) + Math.pow(A[1], 2)) <
                Math.sqrt(Math.pow(B[0], 2) + Math.pow(B[1], 2))) ?
                "first" : "second";
    }
}
