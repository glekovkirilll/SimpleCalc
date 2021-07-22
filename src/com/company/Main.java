package com.company;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static float inputNumber(char index) {
        float number;
        System.out.println("Введите число " + index + ": ");

        if(!in.hasNextDouble()) {
            System.out.println("Введено некорректное число! Попробуйте снова...");
            in.next();
            number = inputNumber(index);
        }
        else {
            number = in.nextFloat();
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

    public static double Calculator(float firstNumber, float secondNumber, char sign){
        float result = 0;
        switch (sign){
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if(secondNumber == 0) {
                    System.out.println("Деление на 0 запрещено! Попробуйте ещё раз...");
                    return Calculator(firstNumber, inputNumber('b'), sign);
                }
                else {
                    result = firstNumber / secondNumber;
                }
                break;
            default:
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        float a = inputNumber('a');
        char sign = inputSign();
        float b = inputNumber('b');

        double result = Calculator(a,b,sign);
        System.out.println(result);
    }
}
