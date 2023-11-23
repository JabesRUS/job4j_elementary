package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount * percent / 100 > 0) {
            year++;
            amount = amount + amount * percent / 100 - salary;
        }
        return year;
    }
}
