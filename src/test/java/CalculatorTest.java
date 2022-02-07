import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){calculator = new Calculator();}

    @Test
    public void canAdd(){
        assertEquals(10, calculator.add(6, 4));
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calculator.subtract(7, 3));
    }

    @Test
    public void canMultiply(){
        assertEquals(50, calculator.multiply(5, 10));
    }

    @Test
    public void canDivide(){
        assertEquals (1.25, calculator.divide(5, 4), 0.0);
    }
}
