package pl.tmaj;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {

    private static Object[] operations() {
        return $($(new Add(), 1, 3, 4L),
                $(new Subtract(), 10L, 4L, 6L),
                $(new Divide(), 16L, 2L, 8L),
                $(new Multiply(), 2L, 4L, 8L),
                $(new Power(), 2L, 8L, 512L)
        );
    }

    @Test
    @Parameters(method = "operations")
    public void shouldCalculateOperations(Operation operation, long a, long b, long result) {
        Calculator<Operation> calculator = new Calculator<>(operation);
        assertThat(calculator.calculate(a, b), is(result));
    }
}