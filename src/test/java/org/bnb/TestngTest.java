package org.bnb;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngTest {
    @Test
    public void testFactorialWithPositiveNumber() {
        int number = 4;
        int expectedFactorial = 24;

        int factorial = number;
        for (int i = (number - 1); i > 1; i--) {
            factorial = factorial * i;
        }

        Assert.assertEquals(factorial, expectedFactorial);
    }
}