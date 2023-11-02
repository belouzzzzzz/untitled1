/*
Есть входной файл с набором слов, написанных через пробел Необходимо:
- Прочитать слова из файла.
- Отсортировать в алфавитном порядке.
- Посчитать сколько раз каждое слово встречается в файле
- Вывести статистику на консоль
- Найти слово с максимальным количеством повторений
- Вывести на консоль это слово и сколько раз оно встречается в файле
 */
package Collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CollectionWork {

    // создаем метод main
    public static void main(String[] args) {
        // в переменной задаем путь до файла
        String fileName = "/Users/alekseybelousov/IdeaProjects/untitled1/src/main/java/Collections/text.txt";
        // вызываем метод ReadFromFile и сохраняем список слов в переменную words
        List<String> words = ReadFromFile(fileName);
        // выводим список слов на консоль
        System.out.println("Список слов: " + words);
        // сортируем слова в алфавитном порядке и еще раз выводим на консоль
        Collections.sort(words);
        System.out.println("А теперь в алфавитном порядке: " + words);

        // создаем HashMap для хранения статистики
        HashMap<String, Integer> wordCount = new HashMap<>();
        // считаем количество повторений каждого слова и сохраняем в HashMap
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        // выводим статистику на консоль
        System.out.println("Статистика:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // находим максимальное количество повторений
        int maxCount = 0;
        for (int count : wordCount.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // находим все слова с максимальным количеством повторений
        List<String> maxWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == maxCount) {
                maxWords.add(entry.getKey());
            }
        }

        // выводим на консоль слова с максимальным количеством повторений
        System.out.println("Слово(а) с максимальным количеством повторений: " + maxWords);
        System.out.println("Количество повторений: " + maxCount);
    }

    // создаем метод ReadFromFile, который будет читать слова из файла и возвращать список слов
    private static List<String> ReadFromFile(String fileName) {
        // создаем пустой список слов
        List<String> words = new ArrayList<>();
        // создаем объект File и Scanner для чтения файла
        File file = new File(fileName);
        Scanner scanner = null;
        // обрабатываем исключение, если файл не найден
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // читаем слова из файла и добавляем их в список слов
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        // возвращаем список слов
        return words;
    }

}



