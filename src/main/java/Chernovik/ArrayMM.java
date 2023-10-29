package Chernovik;

import java.util.Arrays;
import java.util.Random;

public class ArrayMM {
    public static void main(String[] args) {
        int[] arr = new int[20]; // создаем массив, указываем его размер
        Random random = new Random(); // создаем элемент рандома

        for (int i = 0; i < arr.length; i++) { // заполняем массив случайными числами от -10 до 10
            arr[i] = random.nextInt(21) - 10;
        }
        System.out.println(Arrays.deepToString(new int[][]{arr})); // выводим получившейся массив

        int minPositive = findMinPositive(arr); // находим минимальный положительный элемент массива
        int maxNegative = findMaxNegative(arr); // находим максимальный отрицательный элемент массива

        System.out.println("Минимальный положительный элемент: " + minPositive);
        System.out.println("Максимальный отрицательный элемент: " + maxNegative);
    }

    public static int findMinPositive(int[] arr) {
        int minPositive = 21;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < minPositive) {
                minPositive = arr[i];
            }
        }
        return minPositive;
    }

    public static int findMaxNegative(int[] arr) {
        int maxNegative = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i] > maxNegative) {
                maxNegative = arr[i];
            }
        }
        return maxNegative;
    }
}

