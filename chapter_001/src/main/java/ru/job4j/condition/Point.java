package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;

    Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distace(Point that) {
        return sqrt(pow((that.x - this.x), 2) + pow((that.y - this.y), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distace(b);
        System.out.println(dist);
    }
}