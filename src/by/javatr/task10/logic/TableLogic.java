package by.javatr.task10.logic;

public class TableLogic {

    public static double[][] calculate(double start, double end, double step){

        double y;
        double[][] result;

        int iterNum = (int) ((end-start)/step) + 1;//TODO check if +1 always needed

        result = new double[2][iterNum];

        for (int i = 0; i < iterNum; i++) {

            result[0][i] = start;
            result[1][i] = Math.tan(start);
            start += step;
        }

        return result;
    }

    public static String createTable(double[][] result) {


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("+-------+-------+\n");
        stringBuilder.append("|      x|      y|\n");
        stringBuilder.append("+-------+-------+\n");


        int tableSize = result[0].length;
        for (int i = 0; i < tableSize; i++) {
            stringBuilder.append(String.format("|%7.3f|%7.3f|\n", result[0][i], result[1][i]));
        }

        stringBuilder.append("+-------+-------+\n");

        return stringBuilder.toString();
    }
}
