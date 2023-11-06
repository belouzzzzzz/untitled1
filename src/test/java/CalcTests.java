import Calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTests {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(2, 3, "+");
        assertEquals("Результат сложения ожидается 5 ", 5, result, 0);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(5, 2, "-");
        assertEquals("Результат вычитания ожидается з ", 3, result, 0);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(4, 3, "*");
        assertEquals("Результат умножения ожидается 12 ", 12, result, 0);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(10, 2, "/");
        assertEquals("Результат деления ожидается 5 ", 5, result, 0);
    }
    @Test(expected = ArithmeticException.class)
    public void testCalculateDivisionByZero() {
        Calculator calculator = new Calculator();
        calculator.calculate(5.0, 0.0, "/");
    }


    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperatorSymbol() {
        Calculator calculator = new Calculator();
        calculator.calculate(5.0, 2.0, "a");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInputMismatchExceptionForX() {
        Calculator calculator = new Calculator();
        calculator.calculate(Double.parseDouble("a"), 2.0, "+");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInputMismatchExceptionForY() {
        Calculator calculator = new Calculator();
        calculator.calculate(5.0, Double.parseDouble("a"), "/");
    }

}




