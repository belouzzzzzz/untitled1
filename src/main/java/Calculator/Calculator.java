package Calculator;
/**
 * Класс calculate - спомощью оператора switch выбирает операцию с числами на основе введеного ползователем значения операции (переменной operator)
 * @author belousov
 * @version 1
 */

public class Calculator {
    public double calculate(double x, double y, String operator) {
        switch (operator) {
            case "+":
                return new Addition().calculate(x, y);
            case "-":
                return new Subtraction().calculate(x, y);
            case "*":
                return new Multiplication().calculate(x, y);
            case "/":
                return new Division().calculate(x, y);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}

