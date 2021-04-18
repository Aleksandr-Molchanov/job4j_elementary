package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double balance = amount + amount * percent / 100;
        while (balance > 0) {
            year++;
            balance = balance - salary;
        }
        return year;
    }
}