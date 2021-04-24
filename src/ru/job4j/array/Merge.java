package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        if (left.length == 0) {
            rsl = right;
        } else if (right.length == 0) {
            rsl = left;
        } else {
            int leftIn = 0;
            int rightIn = 0;
            for (int index = 0; index < rsl.length && leftIn < left.length; index++) {
                if (left[leftIn] <= right[rightIn]) {
                    rsl[index] = left[leftIn];
                    leftIn++;
                } else {
                    rsl[index] = right[rightIn];
                    rightIn++;
                }
            }
            for (int index = leftIn + rightIn; index < rsl.length; index++) {
                if (leftIn == left.length) {
                    rsl[index] = right[rightIn];
                    rightIn++;
                } else {
                    rsl[index] = left[leftIn];
                    leftIn++;
                }
            }
        }
        return rsl;
    }
}