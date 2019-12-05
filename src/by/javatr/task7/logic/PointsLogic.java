package by.javatr.task7.logic;

public class PointsLogic {

    private PointsLogic() {}

    private static int coordinatesNum;

    public static int[] closest2DPoint(int[] A, int[] B) {
        coordinatesNum = 2;

        if (verify(A))
            throw new IllegalArgumentException("Некорректный аргумент для первой координаты.");
        if (verify(B))
            throw new IllegalArgumentException("Некорректный аргумент для второй координаты.");

        return (Math.sqrt(Math.pow(A[0], 2) + Math.pow(A[1], 2)) <
                Math.sqrt(Math.pow(B[0], 2) + Math.pow(B[1], 2))) ?
                A : B;
    }

    private static boolean verify(int[] array) {
        return (array != null && array.length == coordinatesNum);
    }
}
