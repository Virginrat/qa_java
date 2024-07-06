package com.tests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FelineKittensParamTest {

    private final int expected;

    public FelineKittensParamTest(int expected) {
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getKittensData() {
        return Arrays.asList(new Object[][]{
                {1},
                {0},
                {-1},
        });
    }

    @Test
    public void testGetKittensWithArgument() {
        Feline feline = new Feline();
        int actual = feline.getKittens(expected);
        Assert.assertEquals(expected, actual);
    }
}
