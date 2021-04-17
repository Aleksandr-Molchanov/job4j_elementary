package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double balance = amount + amount * percent / 100;
        while (balance > salary) {
            year++;
            balance = balance - salary;
        }
        return year;
    }
}