package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int dif = money - price;
        for (int coin : coins) {
            while ((dif >= coin)) {
                rsl[size] = coin;
                size++;
                dif = dif - coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
