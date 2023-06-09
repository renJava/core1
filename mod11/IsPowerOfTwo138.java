package academy.kata.educational_process.core1.mod11;

import java.util.Scanner;

/**
 * Реализуй метод isPowerOfTwo, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 */
public class IsPowerOfTwo138 {
    public static boolean isPowerOfTwo(int value) {
        //Твой код здесь
        return (Integer.bitCount(Math.abs(value)) == 1);
    }

    public static void main(String[] args) {
        System.out.print("\nПроверка является ли число чистой степенью 2-ки: ");
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        System.out.println("Является ли чистым квадратом 2 ? " + isPowerOfTwo(result) );
    }
}
