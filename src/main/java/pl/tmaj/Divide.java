package pl.tmaj;

public class Divide implements Operation {

    @Override
    public long apply(long a, long b) {
        long result;
        try {
            result = a / b;
        } catch (ArithmeticException exception) {
            result = 0;
        }
        return result;
    }
}
