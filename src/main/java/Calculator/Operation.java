/**
 * Абстрактный класс Operation - определяет метод calculate, который должен быть реализован в каждом унаследованном подклассе для выполненя математических операций
 * @author belousov
 * @version 1
 */
package Calculator;

abstract class Operation {
    public abstract double calculate(double x, double y);
}

class Addition extends Operation {
    public double calculate(double x, double y) {
        return x + y;
    }
}
class Subtraction extends Operation {
    public double calculate(double x, double y) {
        return x - y;
    }
}
class Multiplication extends Operation {
    public double calculate(double x, double y) {
        return x * y;
    }
}
class Division extends Operation {
    public double calculate(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return x / y;
    }
}