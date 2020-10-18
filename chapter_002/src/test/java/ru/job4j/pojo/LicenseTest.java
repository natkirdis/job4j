package ru.job4j.pojo;

import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class LicenseTest {

    @Test
    public void eqCode() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }

    @Test
    public void eqCodeDifModel() {
        License first = new License();
        first.setCode("audio");
        first.setOwner("Natalia");
        License second = new License();
        second.setCode("audio");
        second.setOwner("Denis");
        assertThat(first, is(not(second)));
    }
}