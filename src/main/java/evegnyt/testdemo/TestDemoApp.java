package evegnyt.testdemo;

public class TestDemoApp {
    public static void main(String[] args) {
        AddService addService = new AddService();
        Calculator calculator = new Calculator(addService);
        System.out.println(calculator.sum(1, 1));
    }
}
