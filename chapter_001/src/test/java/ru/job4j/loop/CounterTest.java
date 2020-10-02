package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromTwoToTenThenThirty() {
        int rsl = Counter.sumByEven(2, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToOneThenZero() {
        int rsl = Counter.sumByEven(1, 1);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromMinusTwoToTwoThenZero() {
        int rsl = Counter.sumByEven(1, 1);
        int expected = 0;
        assertThat(rsl, is(expected));
    }
}