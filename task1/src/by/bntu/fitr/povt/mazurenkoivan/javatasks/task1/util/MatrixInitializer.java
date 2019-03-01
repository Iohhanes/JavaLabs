package by.bntu.fitr.povt.mazurenkoivan.javatasks.task1.util;

import java.util.Random;

public class MatrixInitializer {
    public static void rndInit(int[][] matrix, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                matrix[i][j] = random.nextInt(max - min + 1) + min;
        }
    }

}
