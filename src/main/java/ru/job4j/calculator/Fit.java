package ru.job4j.calculator;

public class Fit {
    private static final short BASE_HEIGHT_MAN = 100;
    private static final short BASE_HEIGHT_WOMAN = 110;
    private static final double WEIGHT_COEFFICIENT = 1.15;

    public static double manWeight(short height) {
        return (height - BASE_HEIGHT_MAN) * WEIGHT_COEFFICIENT;
    }

    public static double womanWeight(short height) {
        return (height - BASE_HEIGHT_WOMAN) * WEIGHT_COEFFICIENT;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        double man = Fit.manWeight(heightMan);
        System.out.println(String.format("Man %d is %.2f", heightMan, man));

        short heightWoman = 160;
        double woman = Fit.womanWeight(heightWoman);
        System.out.println(String.format("Woman %d is %.2f", heightWoman, woman));
    }
}
