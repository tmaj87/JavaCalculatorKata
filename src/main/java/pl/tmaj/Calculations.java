package pl.tmaj;

public enum Calculations {

    ADD {
        @Override
        long apply(long x, long y) {
            return x + y;
        }
    },
    SUBTRACT {
        @Override
        long apply(long x, long y) {
            return x - y;
        }
    },
    MULTIPLY {
        @Override
        long apply(long x, long y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        long apply(long x, long y) {
            return x / y;
        }
    },
    POWER {
        @Override
        long apply(long x, long y) {
            if (y > 0) {
                return x * apply(x, y - 1);
            }
            return 1;
        }
    };

    abstract long apply(long x, long y);
}
