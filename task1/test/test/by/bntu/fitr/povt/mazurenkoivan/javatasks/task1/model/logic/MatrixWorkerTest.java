package test.by.bntu.fitr.povt.mazurenkoivan.javatasks.task1.model.logic;

import by.bntu.fitr.povt.mazurenkoivan.javatasks.task1.model.logic.MatrixWorker;
import org.junit.jupiter.api.*;

public class MatrixWorkerTest {

    @Test
    public void testNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            MatrixWorker.getCountLocalMinimum(null);
        });
    }

    @Test
    public void testIsEmpty() {
        int[][] array = {};
        int actual = MatrixWorker.getCountLocalMinimum(array);
        int except = 0;
        Assertions.assertEquals(except, actual, except);
    }

    @Test
    public void testDefault() {
        int[][] array = {{1, 2, 3}, {4, -10, 5}, {6, 7, 8}};
        int actual = MatrixWorker.getCountLocalMinimum(array);
        int except = 1;
        Assertions.assertEquals(except, actual, except);
    }
}