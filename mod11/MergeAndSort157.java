package academy.kata.educational_process.core1.mod11;

import java.util.Arrays;

public class MergeAndSort157 {
    /**
     * Реализовать метод mergeAndSort(int[] firstArr, int[] secondArray),
     * который принимает соединяет и сортирует два произвольных массива чисел
     */
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        //твой код тут
        int firstArrayL = firstArray.length;
        int secondArrayL = secondArray.length;

        int[] resultUnsortAr = new int[firstArrayL + secondArrayL];

        if (firstArrayL == 0 && secondArrayL == 0) {
            return new int[0];
        }

        int totalCounter = firstArrayL;

        System.arraycopy(firstArray, 0, resultUnsortAr, 0, firstArrayL);

        for (int j : secondArray) {
            resultUnsortAr[totalCounter++] = j;                   //Добавляем правее по возрастанию индекса
        }

        boolean hasNotSorted = false;
        int temp;
        while (!hasNotSorted) {
            hasNotSorted = true;
            for (int i = 0; i < resultUnsortAr.length - 1; i++) {
                if (resultUnsortAr[i] > resultUnsortAr[i + 1]) {
                    hasNotSorted = false;

                    temp = resultUnsortAr[i];
                    resultUnsortAr[i] = resultUnsortAr[i + 1];
                    resultUnsortAr[i + 1] = temp;
                }
            }
        }
        return resultUnsortAr;
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 13, 15, 21, 29, 11, 23, 18, 20};        // 9 элементов
        int[] arr2 = {17, 12, 51, 17, 99, 1, 6, 14, 3, 19};       // 10 элементов
        System.out.println("\n\nИтоговый диапазон: ");
        System.out.println(Arrays.toString(mergeAndSort(arr1, arr2)));
    }

}
