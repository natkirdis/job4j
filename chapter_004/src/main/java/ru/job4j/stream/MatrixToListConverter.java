package ru.job4j.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatrixToListConverter {
        public List<Integer> convertMatrixToList(Integer[][] matrix) {
            return Arrays.stream(matrix)
                    .flatMap(Arrays::stream)
                    .collect(Collectors.toList());
        }
    }
