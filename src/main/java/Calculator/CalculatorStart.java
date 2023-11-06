/**
 * Класс CalculatorStart - содержит основную логику работы калькулятора
 *
 * @author belousov
 * @version 1
 */

package Calculator;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CalculatorStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        boolean inputCorrectX = false;
        boolean operationCorrect = false;
        boolean inputCorrectY = false;
        double x = 0;
        double y = 0;
        String operation = null;

        do {
            try {
                System.out.println("Введите первое число: ");
                x = scanner.nextDouble();
                inputCorrectX = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Введите число.");
                scanner.next();
            }
        } while (!inputCorrectX);

        do {
            try {
                System.out.println("Выберите тип операции (+,-,*,/): ");
                operation = scanner.next();
                if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
                    operationCorrect = true;
                } else {
                    throw new NoSuchElementException();
                }
            } catch (NoSuchElementException e) {
                System.out.println("Ошибка ввода! Введите только один из символов: +,-,*,/");
                scanner.next();
            }
        } while (!operationCorrect);

        do {
            try {
                System.out.println("Введите второе число: ");
                y = scanner.nextDouble();
                inputCorrectY = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Введите число.");
                scanner.next();
            }
        } while (!inputCorrectY);

        double result = calculator.calculate(x, y, operation);

        System.out.println("Result: " + result);
    }


}


