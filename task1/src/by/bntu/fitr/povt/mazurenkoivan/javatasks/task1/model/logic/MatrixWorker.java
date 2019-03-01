package by.bntu.fitr.povt.mazurenkoivan.javatasks.task1.model.logic;

public class MatrixWorker {

    private static void isMatrixNull(int[][] matrix) {
        if (matrix == null) {
            throw new NullPointerException();
        }
    }

    private static boolean isLocalMinimumInCenter(int[][] matrix, int indexi, int indexj) {
        int centerElement = matrix[indexi][indexj];
        return (centerElement < matrix[indexi][indexj + 1] && centerElement < matrix[indexi + 1][indexj + 1] &&
                centerElement < matrix[indexi + 1][indexj] && centerElement < matrix[indexi + 1][indexj - 1] &&
                centerElement < matrix[indexi][indexj - 1] && centerElement < matrix[indexi - 1][indexj - 1] &&
                centerElement < matrix[indexi - 1][indexj] && centerElement < matrix[indexi - 1][indexj + 1]) ?
                true : false;
    }

    private static boolean isLocalMinimumInAngle(int[][] matrix, int indexi, int indexj) {
        int centerElement = matrix[indexi][indexj];
        return (centerElement < matrix[indexi][(indexj == 0) ? indexj + 1 : indexj - 1] &&
                centerElement < matrix[(indexi == 0) ? indexi + 1 : indexi - 1][indexj] &&
                centerElement < matrix[(indexi == 0) ? indexi + 1 : indexi - 1][(indexj == 0) ? indexj + 1 : indexj - 1]) ?
                true : false;
    }

    private static boolean isLocalMinimumInBorder(int[][] matrix, int indexi, int indexj) {
        int centerElement = matrix[indexi][indexj];
        boolean result;
        if (indexi == 0 || indexi == matrix.length - 1) {
            result = (centerElement < matrix[indexi][indexj + 1] && centerElement < matrix[indexi][indexj - 1] &&
                    centerElement < matrix[(indexi == 0) ? indexi + 1 : indexi - 1][indexj + 1] &&
                    centerElement < matrix[(indexi == 0) ? indexi + 1 : indexi - 1][indexj] &&
                    centerElement < matrix[(indexi == 0) ? indexi + 1 : indexi - 1][indexj - 1]) ?
                    true : false;
        } else {
            result = (centerElement < matrix[indexi + 1][indexj] &&
                    centerElement < matrix[indexi - 1][indexj] &&
                    centerElement < matrix[indexi + 1][(indexj == 0) ? indexj + 1 : indexj - 1] &&
                    centerElement < matrix[indexi][(indexj == 0) ? indexj + 1 : indexj - 1] &&
                    centerElement < matrix[indexi - 1][(indexj == 0) ? indexj + 1 : indexj - 1]) ?
                    true : false;

        }
        return result;
    }

    public static int getCountLocalMinimum(int[][] matrix) {
        MatrixWorker.isMatrixNull(matrix);
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ((i == 0 && (j == 0 || j == matrix[0].length - 1)) ||
                        (i == matrix.length - 1 && (j == 0 || j == matrix[0].length - 1))) {
                    if (isLocalMinimumInAngle(matrix, i, j)) {
                        count++;
                    }
                } else {
                    if (i == 0 || j == 0 || i == matrix.length - 1 || j == matrix[0].length - 1) {
                        if (isLocalMinimumInBorder(matrix, i, j)) {
                            count++;
                        }
                    } else {
                        if (isLocalMinimumInCenter(matrix, i, j)) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
