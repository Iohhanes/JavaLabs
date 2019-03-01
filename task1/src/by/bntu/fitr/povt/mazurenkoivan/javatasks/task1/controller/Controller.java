package by.bntu.fitr.povt.mazurenkoivan.javatasks.task1.controller;

import by.bntu.fitr.povt.mazurenkoivan.javatasks.task1.model.logic.MatrixWorker;
import by.bntu.fitr.povt.mazurenkoivan.javatasks.task1.util.MatrixInitializer;
import by.bntu.fitr.povt.mazurenkoivan.javatasks.task1.view.Printer;

import java.util.Arrays;

public class Controller {

    public static void main(String[] args) {

        int colLength = 3;
        int rowLength = 3;
        int[][] matrix = new int[colLength][rowLength];
        //int[][] matrix={{1,3,20},{5,0,-50},{-5,-7,-10}};
        MatrixInitializer.rndInit(matrix, -10, 10);
        Printer printer = new Printer();
        printer.print("\nMatrix:\n");
        for (int i = 0; i < matrix.length; i++) {
            printer.print(Arrays.toString(matrix[i]) + "\n");
        }
        int result = MatrixWorker.getCountLocalMinimum(matrix);
        printer.print("\nResult: " + result);
    }
}
