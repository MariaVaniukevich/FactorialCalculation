package org.bnb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Junit5Test {
    @Test
    public void testFactorialWithPositiveNumber() {
        int number = 4;
        int expectedFactorial = 24;

        int factorial = number;
        for (int i = (number - 1); i > 1; i--) {
            factorial = factorial * i;
        }

        Assertions.assertEquals(expectedFactorial, factorial);
    }
}