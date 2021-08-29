package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when7and4to2and12then9dot43() {
        double expected = 9.43;
        int x1 = 7;
        int y1 = 4;
        int x2 = 2;
        int y2 = 12;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
        }

    @Test
    public void when20and4to0and25then29() {
        double expected = 29;
        int x1 = 20;
        int y1 = 4;
        int x2 = 0;
        int y2 = 25;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10and0to12and8then8dot25() {
        double expected = 8.25;
        int x1 = 10;
        int y1 = 0;
        int x2 = 12;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}