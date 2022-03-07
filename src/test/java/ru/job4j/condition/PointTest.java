package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when7and4to2and12then9dot43() {
        double expected = 9.43;
        Point a = new Point(7, 4);
        Point b = new Point(2, 12);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
        }

    @Test
    public void when20and4to0and25then29() {
        double expected = 29;
        Point a = new Point(20, 4);
        Point b = new Point(0, 25);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10and0to12and8then8dot25() {
        double expected = 8.25;
        Point a = new Point(10, 0);
        Point b = new Point(12, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}