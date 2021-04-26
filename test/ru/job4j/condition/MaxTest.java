package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }
    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }
    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }
    @Test
    public void whenMax2To1To3Then3() {
        int left = 2;
        int right = 1;
        int third = 3;
        int result = Max.max(left, right, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }
    @Test
    public void whenMax2To5To1Then5() {
        int left = 2;
        int right = 5;
        int third = 1;
        int result = Max.max(left, right, third);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
    @Test
    public void whenMax2To1To3To9Then9() {
        int left = 2;
        int right = 1;
        int third = 3;
        int fourth = 9;
        int result = Max.max(left, right, third, fourth);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
    @Test
    public void whenMax2To5To1To0Then5() {
        int left = 2;
        int right = 5;
        int third = 1;
        int fourth = 0;
        int result = Max.max(left, right, third, fourth);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}