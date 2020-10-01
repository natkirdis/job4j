package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax7To4Then7() {
        int result = Max.max(7, 4);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax0To0Then0() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxMinus4ToMinus2ThenMinus2() {
        int result = Max.max(-4, -2);
        assertThat(result, is(-2));
    }
}