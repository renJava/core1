package academy.kata.educational_process.core1.mod11;

import java.math.BigInteger;
import java.util.Scanner;

public class RecFactorial1481 {

    public static BigInteger factorial(int value) {
//Твой код здесь

        if (value < 0) {
            System.err.println("\nОшибка!!! Аргумент факториала: " + value + " < 0\n");
            return BigInteger.valueOf(value);
        }

        return switch (value) {
            case 0, 1 -> BigInteger.valueOf(1);
            default -> BigInteger.valueOf(value).multiply(factorial(value - 1));
        };
    }

    public static void main(String[] args) {
        System.out.print("\nРекурсивное вычисление факториала!\n" + "Введите аргумент факториала: ");
        Scanner scanner = new Scanner(System.in);
        int mainValue = scanner.nextInt();
        System.out.println("\n\nЗначение факториала " + mainValue + "! : " + factorial(mainValue));
    }

}
