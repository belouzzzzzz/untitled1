/**
 * Класс CalculatorStart - содержит основную логику работы калькулятора
 * @author belousov
 * @version 1
 */

package Calculator;

import java.util.Scanner;

public class CalculatorStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Ввендите первое число: ");
        double x = scanner.nextDouble();

        System.out.println("Выберите тип операции (+,-,*,/): ");
        String operation = scanner.next();

        System.out.println("Введите второе число: ");
        double y = scanner.nextDouble();

        double result = calculator.calculate(x, y, operation);

        System.out.println("Result: " + result);
    }
}


