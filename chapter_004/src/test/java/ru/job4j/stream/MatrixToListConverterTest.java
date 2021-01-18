package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixToListConverterTest {

    @Test
    public void matrixToList() {
        Integer[][] input = {{1, 2, 3}, {4, 5, 6}};
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6);
        MatrixToListConverter matrix = new MatrixToListConverter();
        List<Integer> rsl = matrix.convertMatrixToList(input);
        assertThat(rsl, is(expect));
    }
}
