package pl.tmaj;

public class Calculator<T extends Operation> {

    private final T operation;

    public Calculator(T operation) {
        this.operation = operation;
    }

    public long calculate(long a, long b) {
        return operation.apply(a, b);
    }
}
