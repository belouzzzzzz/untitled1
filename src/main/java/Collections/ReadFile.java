package Collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadFile {
    public static void main(String[] args) {
        // Создаем объект File, который ссылается на файл с текстом
        File file = new File("txtFile.txt");

        // Создаем объект Scanner для чтения файла
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Создаем объект ArrayList для хранения слов
        List<String> words = new ArrayList<>();

        // Читаем слова из файла и добавляем их в ArrayList
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }

        // Выводим список слов на консоль
        System.out.println(words);
    }
}
