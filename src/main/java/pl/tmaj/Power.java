package pl.tmaj;

public class Power implements Operation {

    @Override
    public long apply(long a, long b) {
        if (b > 1) {
            return a * apply(a, b - 1);
        }
        return a;
    }
}
