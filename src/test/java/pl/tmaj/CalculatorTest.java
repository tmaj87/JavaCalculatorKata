package pl.tmaj;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CalculatorTest {

    @Test
    void shouldAdd() {
        assertThat(Calculator.add(1, 3), is(4L));
    }
g
    @Test
    void shouldSubtract() {
        assertThat(Calculator.subtract(10, 4), is(6L));
    }

    @Test
    void shouldDivide() {
        assertThat(Calculator.divide(16, 2), is(8L));
    }

    @Test
    void shouldMultiply() {
        assertThat(Calculator.multiply(2, 4), is(8L));
    }

    @Test
    void shouldPower() {
        assertThat(Calculator.power(2, 8), is(512L));
    }
}