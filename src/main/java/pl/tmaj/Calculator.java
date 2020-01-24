package pl.tmaj;

public class Calculator {

    public static long add(long a, long b) {
        return new Add().apply(a, b);
    }

    public static long subtract(long a, long b) {
        return new Subtract().apply(a, b);
    }

    public static long divide(long a, long b) {
        return new Divide().apply(a, b);
    }

    public static long multiply(long a, long b) {
        return new Multiply().apply(a, b);
    }

    public static long power(long a, long b) {
        return new Power().apply(a, b);
    }
}
