package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int input[] = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasNo5ThenMinus1() {
        int input[] = {7, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas5LastSimbolThen3() {
        int input[] = {7, 4, 3, 5};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas6LastDiaposonSimbolThen3() {
        int[] input = new int[]{5, 2, 6, 2, 4};
        int value = 6;
        int start = 0;
        int finish = 2;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas6FirstDiaposonSimbolThen3() {
        int[] input = new int[]{5, 2, 6, 2, 4};
        int value = 6;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasNoDiaposonSimbolThenMinus1() {
        int[] input = new int[]{5, 2, 6, 2, 4};
        int value = 5;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}