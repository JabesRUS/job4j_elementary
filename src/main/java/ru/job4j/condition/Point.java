package ru.job4j.condition;

public class Point {

    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow((this.x - point.x), 2.0) + Math.pow((this.y - point.y), 2.0));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
