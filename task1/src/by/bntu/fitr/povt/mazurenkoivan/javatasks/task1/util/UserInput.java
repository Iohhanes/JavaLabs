package by.bntu.fitr.povt.mazurenkoivan.javatasks.task1.util;

import java.util.Scanner;

public class UserInput {

    private Scanner scanner = new Scanner(System.in);

    public double inputDouble(String msg) {
        System.out.print(msg);
        double value = scanner.nextDouble();
        return value;
    }

    public String input(String msg) {
        System.out.print(msg);
        String value = scanner.nextLine();
        return value;
    }

    public int inputInteger(String msg) {
        System.out.print(msg);
        int value = scanner.nextInt();
        return value;
    }
}

