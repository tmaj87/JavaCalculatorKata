package pl.tmaj;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static pl.tmaj.Calculations.*;

@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {

    private static Object[] operations() {
        return $($(ADD, 1, 3, 4L),
                $(SUBTRACT, 10L, 4L, 6L),
                $(DIVIDE, 16L, 2L, 8L),
                $(MULTIPLY, 2L, 4L, 8L),
                $(POWER, 2L, 8L, 256L)
        );
    }

    @Test
    @Parameters(method = "operations")
    public void shouldCalculate(Calculations calculation, long a, long b, double result) {
        assertThat(calculation.applyAsDouble(a, b), is(result));
    }
}