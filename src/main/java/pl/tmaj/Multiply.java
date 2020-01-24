package pl.tmaj;

public class Multiply implements Operation {

    @Override
    public long apply(long a, long b) {
        return a * b;
    }
}
