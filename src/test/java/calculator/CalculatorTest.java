package calculator;

import com.course.jacoco.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
   private final Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoArguments() {
        //given
        int x = 2;
        int y = 4;
        int expected = x + y;
        //when
        int actual = calculator.add(x, y);
        //then
        assertEquals(expected, actual);
    }

    /*@Test
    void shouldSubtracTwoArguments() {
        //given
        int x = 2;
        int y = 4;
        int expected = x - y;
        //when
        int actual = calculator.subtract(x, y);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void shouldDivideArguments() {
        //given
        int x = 2;
        int y = 4;
        double expected = 0.5;
        //when
        double actual = calculator.divide(x, y);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowArithmeticExceptionWhenDividingByZero() {
        int x = 2;
        int y = 0;
        assertThrows(ArithmeticException.class, () -> calculator.divide(x, y));
    }*/
}


