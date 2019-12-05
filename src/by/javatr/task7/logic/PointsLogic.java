package by.javatr.task7.logic;

public class PointsLogic {

    private enum Status {FIRST, SECOND}

    private Status currentStat;

    public static int[] closestPoint(int[] A, int[] B) {
        return (Math.sqrt(Math.pow(A[0], 2) + Math.pow(A[1], 2)) <
                Math.sqrt(Math.pow(B[0], 2) + Math.pow(B[1], 2))) ?
                A : B;
    }

    public static Status getStatus() {

    }
}
