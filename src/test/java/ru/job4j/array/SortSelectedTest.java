package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf7elements() {
        int[] data = new int[] {2, 1, 15, 4, 22, 43, 14};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 4, 14, 15, 22, 43};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {7, 2, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 7};
        Assert.assertArrayEquals(expected, result);
    }
}
