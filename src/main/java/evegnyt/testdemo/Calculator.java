package evegnyt.testdemo;

public class Calculator {
    private final AddService addService;

    public Calculator(AddService addService) {
        this.addService = addService;
    }

    public int sum(int var1, int var2) {
        return addService.add(var1, var2);
    }

}
