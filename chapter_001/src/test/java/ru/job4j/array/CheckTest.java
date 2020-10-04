package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void whenAllTrueThenTrue() {
        boolean inputArray[] = {true, true, true, true};
        boolean result = Check.mono(inputArray);
        assertThat(result, is(true));
    }

    @Test
    public void whenTrueAndFalseThenFalse() {
        boolean inputArray[] = new boolean[] {true, true, true, false, true};
        boolean result = Check.mono(inputArray);
        assertThat(result, is(false));
    }

    @Test
    public void whenFirstFalseAndOtherTrueThenFalse() {
        boolean inputArray[] = new boolean[] {false, true, true, true, true};
        boolean result = Check.mono(inputArray);
        assertThat(result, is(false));
    }
}