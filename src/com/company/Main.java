package com.company;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static double inputNumber(char index) {
        double number;
        System.out.println("Введите число " + index + ": ");

        if(!in.hasNextDouble()) {
            System.out.println("Введено некорректное число! Попробуйте снова...");
            in.next();
            number = inputNumber(index);
        }
        else {
            number = in.nextDouble();
        }
        return number;
    }
    public static char inputSign() {
        char sign;
        System.out.println("Введите знак: ");

        if(in.hasNext()) {
            sign = in.next().charAt(0);
            if(sign == '+' || sign == '-' || sign == '*' || sign == '/') {
                return sign;
            }
            else {
                System.out.println("Введен некорректный знак! Попробуйте снова...");
                sign = inputSign();

            }
        }
        else {
            System.out.println("Введен некорректный знак! Попробуйте снова...");
            sign = inputSign();
        }
        return sign;
    }

    public static void main(String[] args) {
        char sign = inputSign();
        System.out.println(sign);
    }
}
