package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void run() {
    }

    @Test
    @DisplayName("Given one return a string")
    void givenOne_Return_String(){
        Assertions.assertEquals("1", FizzBuzz.run(1));
    }

    @ParameterizedTest
    @CsvSource({"41, 41", "2, 2", "1, 1"})
    @DisplayName("Given a number return as a string")
    void givenNumber_Return_String(int i, String expected){
        assertEquals(expected, FizzBuzz.run(i));
    }

    @Test
    @DisplayName("Given 3 return Fizz")
    void givenThree_Return_Fizz(){
        assertEquals("Fizz", FizzBuzz.run(3));
    }

    @ParameterizedTest
    @CsvSource({"3, Fizz", "6, Fizz", "9, Fizz"})
    @DisplayName("Given a number divisible by 3 (not 5) return Fizz")
    void givenANumberDivisibleByThreeButNotFive_Return_Fizz(int input, String expected){
        assertEquals(expected, FizzBuzz.run(input));
    }

    @Test
    @DisplayName("Given 5 return Buzz")
    void givenFive_Return_Fizz(){
        assertEquals("Buzz", FizzBuzz.run(5));
    }

    @ParameterizedTest
    @CsvSource({"5, Buzz", "10, Buzz", "20, Buzz"})
    @DisplayName("Given a number divisible by 5 (not 3) return Buzz")
    void givenANumberDivisibleByFiveButNotThree_Return_Buzz(int input, String expected){
        assertEquals(expected, FizzBuzz.run(input));
    }


    @Test
    @DisplayName("Given 15 return FizzBuzz")
    void givenFifteen_Return_FizzBuzz(){
        assertEquals("FizzBuzz", FizzBuzz.run(15));
    }

    @ParameterizedTest
    @CsvSource({"15, FizzBuzz", "30, FizzBuzz", "45, FizzBuzz"})
    @DisplayName("Given a number divisible by 15 return FizzBuzz")
    void givenANumberDivisibleByFifteen_Return_FizzBuzz(int input, String expected){
        assertEquals(expected, FizzBuzz.run(input));
    }
}