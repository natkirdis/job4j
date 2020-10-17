package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTests {
    @Test
    public void when3dPoints() {
        Point a = new Point(0, 0, 7);
        Point b = new Point(4, 0, 3);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(5.656, 0.001));
    }

    @Test
    public void when2dPoints() {
        Point a = new Point(-1, 6);
        Point b = new Point(4, -3);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(10.295, 0.001));
    }
}