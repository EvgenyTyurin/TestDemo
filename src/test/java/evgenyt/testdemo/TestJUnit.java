package evgenyt.testdemo;

/*
    JUnit + Mockito
 */

import evegnyt.testdemo.AddService;
import evegnyt.testdemo.Calculator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJUnit {

    @Test
    void testSum() {
        // calculator with mock
        AddService addService = Mockito.mock(AddService.class);
        Calculator calculator = new Calculator(addService);

        // test data
        int num1 = 11;
        int num2 = 12;
        int expected = 23;
        when(addService.add(num1, num2)).thenReturn(expected);

        // test
        int actual = calculator.sum(num1, num2);
        assertEquals(expected, actual);
    }

}
