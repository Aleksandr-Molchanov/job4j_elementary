package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIn = 0;
        int rightIn = 0;
        for (int index = 0; index < rsl.length; index++) {
            if (leftIn == left.length) {
                rsl[index] = right[rightIn];
                rightIn++;
            } else if (rightIn == right.length) {
                rsl[index] = left[leftIn];
                leftIn++;
            } else if (left[leftIn] <= right[rightIn]) {
                rsl[index] = left[leftIn];
                leftIn++;
            } else {
                rsl[index] = right[rightIn];
                rightIn++;
            }
        }
        return rsl;
    }
}