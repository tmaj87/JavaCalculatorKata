package pl.tmaj;

import java.util.function.DoubleBinaryOperator;

public enum Calculations implements DoubleBinaryOperator {

    ADD((x, y) -> x + y),
    SUBTRACT((x, y) -> x - y),
    MULTIPLY((x, y) -> x * y),
    DIVIDE((x, y) -> x / y),
    POWER((x, y) -> {
        DoubleBinaryOperator op = new DoubleBinaryOperator() {
            @Override
            public double applyAsDouble(double x, double y) {
                if (y > 0) {
                    return x * applyAsDouble(x, y - 1);
                }
                return 1;
            }
        };
        return op.applyAsDouble(x, y);
    });

    private final DoubleBinaryOperator operator;

    Calculations(DoubleBinaryOperator operator) {
        this.operator = operator;
    }

    @Override
    public double applyAsDouble(double x, double y) {
        return operator.applyAsDouble(x, y);
    }
}
