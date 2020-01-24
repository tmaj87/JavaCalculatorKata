package pl.tmaj;

public class Add implements Operation {

    @Override
    public long apply(long a, long b) {
        return a + b;
    }
}
