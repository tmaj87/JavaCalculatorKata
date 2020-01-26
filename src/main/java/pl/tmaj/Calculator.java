package pl.tmaj;

public class Calculator {

    private final Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public long calculate(long a, long b) {
        return operation.apply(a, b);
    }
}
