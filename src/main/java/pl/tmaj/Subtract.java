package pl.tmaj;

public class Subtract implements Operation {

    @Override
    public long apply(long a, long b) {
        return a - b;
    }
}
