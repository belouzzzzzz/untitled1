import Calculator.Calculator;
import Calculator.CalculatorStart;
import org.testng.annotations.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;
import static org.junit.Assert.*;

public class CalcTests {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(2, 3, "+");
        assertEquals("Результат сложения ожидается 5 ",5, result,0);
    }
    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(5, 2, "-");
        assertEquals("Результат вычитания ожидается з ", 3, result,0);
    }
    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(4, 3, "*");
        assertEquals("Результат умножения ожидается 12 ",12, result,0);
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(10, 2, "/");
        assertEquals("Результат деления ожидается 5 ", 5, result,0);
    }

    @Test
    void testInputMismatchExceptionForX() {
        String input = "a\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        try {
            CalculatorStart.main(new String[0]);
        } catch (InputMismatchException e) {
            assertEquals("Ожидаем сообщение", "Ошибка ввода! Введите число.", e);
        }
    }
    @Test
    void testInputMismatchExceptionForY() {
        String input = "2\n+\na\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        try {
            CalculatorStart.main(new String[0]);
        } catch (InputMismatchException e) {
            assertEquals("Ошибка ввода! Введите число.", e);
        }
    }

    @Test
    public void testInvalidOperatorSymbol() throws InputMismatchException {
        String input = "2\n^\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        try {
            CalculatorStart.main(new String[0]);
            fail("Expected InputMismatchException");
        } catch (InputMismatchException e) {
            assertEquals("Ошибка ввода! Введите только один из символов: +,-,*,/", e);
        }
    }
}




