package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortWithPositiveNumbers() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortWithNegativeNumbers() {
        int[] input = new int[]{-3, -4, -1, -2, -5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{-5, -4, -3, -2, -1};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSimilarNumbers() {
        int[] input = new int[]{6, 6, 0, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{0, 2, 5, 6, 6};
        assertThat(result, is(expect));
    }
    @Test
    public void when3Numbers() {
        int[] input = new int[]{1, 2, 3};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3};
        assertThat(result, is(expect));
    }
}