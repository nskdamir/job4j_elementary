package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest  {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP2K4Square0dot16() {
        double expected = 0.16;
        int p = 2;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP42K8Square43dot55() {
        double expected = 43.55;
        int p = 42;
        double k = 8;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}