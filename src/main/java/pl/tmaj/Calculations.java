package pl.tmaj;

import java.util.function.DoubleBinaryOperator;

public enum Calculations implements DoubleBinaryOperator {

    ADD(Double::sum),
    SUBTRACT((a, b) -> a - b),
    MULTIPLY((a, b) -> a * b),
    DIVIDE((a, b) -> a / b),
    POWER((a, b) -> {
        DoubleBinaryOperator op = new DoubleBinaryOperator() {
            @Override
            public double applyAsDouble(double a, double b) {
                return  b > 0 ? a * applyAsDouble(a, b - 1) : 1;
            }
        };
        return op.applyAsDouble(a, b);
    });

    private final DoubleBinaryOperator operator;

    Calculations(DoubleBinaryOperator operator) {
        this.operator = operator;
    }

    @Override
    public double applyAsDouble(double a, double b) {
        return operator.applyAsDouble(a, b);
    }
}
