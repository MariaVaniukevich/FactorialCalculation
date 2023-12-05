package org.bnb;

public class App {
    public static void main(String[] args) {
        int number = 4;
        int factorial = number;

        for (int i = (number - 1); i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Факториал равен " + factorial);
    }
}