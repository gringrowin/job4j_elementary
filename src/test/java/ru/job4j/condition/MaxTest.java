package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To2Then4() {
        int first = 4;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int first = 4;
        int second = 4;
        int result = Max.max(first, second);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To4To6Then7() {
        int first = 7;
        int second = 4;
        int third = 6;
        int result = Max.max(first, second, third);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5To5Then5() {
        int first = 5;
        int second = 5;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To4To6To8Then8() {
        int first = 2;
        int second = 4;
        int third = 6;
        int fourth = 8;
        int result = Max.max(first, second, third, fourth);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To4To4To4Then4() {
        int first = 4;
        int second = 4;
        int third = 4;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}