package ru.job4j.condition;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        double x = percent * prize - pay;
        if (x > 0) {
            return (int) x;
        } else {
            return 0;
        }
    }
}