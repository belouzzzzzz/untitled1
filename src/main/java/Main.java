import java.util.Scanner;

/**
 * Класс запуска всей программы
 * @author belousov
 * @version 1
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Чем займемся?\n1 - запустить калькулятор\n2 - работа с массивом\nВыбери 1 или 2"); // выводим в консоль текст
        Scanner sc = new Scanner(System.in); // подключаем сканнер, создаем переменную сканнера "sc"
        int act = sc.nextInt();
        if (act == 1) {
            Base.main();
        } else {
            Array.main();
        }
        sc.close(); // закрываем сканнер
    }
}
