package com.company;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static double enterNumber(char a) {
        double number;
        System.out.println("Введите число " + a + ": ");

        if(!in.hasNextDouble()) {
            System.out.println("Введено некорректное число! Попробуйте снова: ");
            in.next();
            number = enterNumber(a);
        }
        else {
            number = in.nextDouble();
        }
        return number;
    }

    public static void main(String[] args) {
        double num1 = enterNumber('a');
        System.out.println(num1);
    }
}
