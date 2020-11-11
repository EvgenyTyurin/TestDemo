package evgenyt.testdemo;

/*
    TestNG + Mockito
*/

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

import evegnyt.testdemo.AddService;
import evegnyt.testdemo.Calculator;

import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.mockito.Mock;

public class TestTestNG {

    @Mock
    private AddService addService;

    // init mocks
    @BeforeMethod
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    // test with data from dp()
    @Test(dataProvider = "dp")
    public void TestSum(int val1, int val2) {
        System.out.println("test with val1=" + val1 + " val2=" + val2);
        // init with mock
        Calculator calculator = new Calculator(addService);
        // what we want?
        int expected = val1 + val2;
        when(addService.add(val1, val2)).thenReturn(expected);
        // what we get?
        int actual = calculator.sum(val1, val2);
        // check results
        assertEquals(expected, actual);
    }

    // test data
    @DataProvider
    public Object[][] dp() {
        return new Object[][] { new Object[] { 1, 1 }, new Object[] { 2, 2 }, };
    }

}
