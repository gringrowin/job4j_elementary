package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2.0) + pow(this.y - that.y, 2.0));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2.0) + pow(this.y - that.y, 2.0) + pow(this.z - that.z, 2.0));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
