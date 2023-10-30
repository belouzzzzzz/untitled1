package MaxMinArray;

import java.util.Arrays;
import java.util.Random;


public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = new int[20]; // создаем массив, указываем его размер
        Random random = new Random(); // создаем элемент рандома

        for (int i = 0; i < arr.length; i++) { // заполняем массив случайными числами от -10 до 10
            arr[i] = random.nextInt(21) - 10;
        }
        System.out.println(Arrays.deepToString(new int[][]{arr})); // выводим получившейся массив

        int min = 11; // создаем переменную для минимального положителного числа
        int max = -11; // создаем переменную для максимального отрицательного числа
        int maxInd = 0; // переменная для индекса максимального элемента
        int minInd = 0; // переменная для индекса минимального элемента
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max && arr[i] < 0) { // находим максимальный отрицательный элемент массива
                max = arr[i];
                maxInd = i;
            }

            if (arr[i] > 0 && arr[i] < min) { // находим минимальный положительный элемент массива
                min = arr[i];
                minInd = i;
            }
        }
        System.out.println("Минимальный положительный элемент: " + min);
        System.out.println("Максимальный отрицательный элемент: " + max);
        // переставляем элементы
        int temp = arr[minInd]; // создаем временную переменную для перестановки элементов
        arr[minInd] = arr[maxInd];
        arr[maxInd] = temp;
        System.out.println(Arrays.deepToString(new int[][]{arr}));
    }
}