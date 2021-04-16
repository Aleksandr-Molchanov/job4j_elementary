package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (hours[i] <= 8) {
                count = count + hours[i] * 10;
            } else {
                count = count + 8 * 10 + (hours[i] % 8 * 15);
            }
        }
        for (int i = 5; i < hours.length; i++) {
            count = count + hours[i] * 20;
        }
        return count;
    }
}