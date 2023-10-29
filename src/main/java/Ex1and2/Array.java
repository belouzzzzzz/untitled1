package Ex1and2;

import java.util.Scanner;

/**
 * Класс работы с массивом
 * @author belousov
 * @version 1
 */

public class Array {
    public static void main() {
        Scanner sc = new Scanner(System.in); // подключаем сканнер, создаем переменную сканнера "sc"
        System.out.println("Введи количество слов в массиве"); // выводим в консоль текст
        int lenghtArray = sc.nextInt(); // создаем переменную "a", записывем в нее значение числа из сканнера
        String[] words = new String[lenghtArray]; // создаем строковый массив длиной заданной пользователем -1

        System.out.println("А теперь заполни массив"); // заполняем массив через цикл
        for (int i = 0; i < lenghtArray; i++) {
            words[i] = sc.next();
        }
        System.out.print("Самое длинное слово в массиве: "); // находим
        String max = words[0];                          // создаем переменную в которую записываем первое слово из массива
        for (int i = 0; i < lenghtArray; i++) {            // в цикле смотрим длину каждого слова и если длина слова больше той, что уже записана в переменную? то переписываем переменную
            int a = words[i].length();
            if (max.length() < a) {
                max = words[i];
            }
            ;
        }
        System.out.println(max);                        // выводим в консоль переменную
        sc.close(); // закрываем сканнер
    }
}
