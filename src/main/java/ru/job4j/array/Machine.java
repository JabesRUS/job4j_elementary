package ru.job4j.array;

import java.util.Arrays;
public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int changeMoney = money - price;
        int i = 0;
        int j = 0;

        while (changeMoney > 0) {
            if (coins[i] <= changeMoney) {
                rsl[j] = coins[i];
                changeMoney -= coins[i];
                size++;
                j++;
            } else {
                i++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
