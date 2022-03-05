package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {

    @Test
    public void whenTurnEven() {
        int[] input = {1, 2, 3, 4};
        int[] result = Turn.back(input);
        int[] expected = {4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnOdd() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] result = Turn.back(input);
        int[] expected = {7, 6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }
}
