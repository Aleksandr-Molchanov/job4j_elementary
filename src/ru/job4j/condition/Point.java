package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        double result2 = Point.distance(2, 1, 6, 2);
        System.out.println("result (2, 1) to (6, 2) " + result2);
        double result3 = Point.distance(7, 5, 8, 4);
        System.out.println("result (7, 5) to (8, 4) " + result3);
    }
}
