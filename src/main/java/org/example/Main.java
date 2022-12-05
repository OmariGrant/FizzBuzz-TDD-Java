package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int max = 50;
        for (int i = 0; i <= max; i++) {
            FizzBuzz.run(i);
        }
    }
}