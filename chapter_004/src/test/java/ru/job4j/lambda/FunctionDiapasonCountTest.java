package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FunctionDiapasonCountTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionDiapasonCount.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenQuadraticResults() {
        List<Double> result = FunctionDiapasonCount.diapason(5, 8, x -> 2 * x * x);
        List<Double> expected = Arrays.asList(50D, 72D, 98D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenSignificantResults() {
        List<Double> result = FunctionDiapasonCount.diapason(2, 5, x -> Math.pow(x, x));
        List<Double> expected = Arrays.asList(8D, 12D, 16D);
    }
}
