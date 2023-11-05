import Calculator.Calculator;
import org.testng.annotations.Test;
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

}
