package ru.job4j.lambda;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringCompareTest {
    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.cmpText.compare(
                "Alla",
                "Bella"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.cmpText.compare(
                "Bella",
                "Alla"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void whenLeftEqualRightResultShouldBeZero() {
        StringCompare compare = new StringCompare();
        int rst = compare.cmpText.compare(
                "Bella",
                "Bella"
        );
        assertThat(rst, is(0));
    }

    @Test
    public void whenLeftHasMoreCharThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.cmpDescSize.compare(
                "Bella",
                "Alla"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void whenLeftHasLessCharThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.cmpDescSize.compare(
                "Alla",
                "Bella"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenLeftHasSameCharAsRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.cmpDescSize.compare(
                "Alla",
                "Ella"
        );
        assertThat(rst, is(0));
    }
}