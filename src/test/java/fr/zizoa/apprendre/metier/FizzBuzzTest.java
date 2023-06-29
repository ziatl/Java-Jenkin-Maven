package fr.zizoa.apprendre.metier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void shouldPrintNumberAsString() {
        Assertions.assertEquals(FizzBuzz.printCorrespond(2), "2");
        Assertions.assertEquals(FizzBuzz.printCorrespond(-2), "-2");
        Assertions.assertEquals(FizzBuzz.printCorrespond(17), "17");
    }

    @Test
    void shouldPrintNumberAsFizz() {
        Assertions.assertEquals(FizzBuzz.printCorrespond(3), "Fizz");
        Assertions.assertEquals(FizzBuzz.printCorrespond(9), "Fizz");
        Assertions.assertEquals(FizzBuzz.printCorrespond(-9), "Fizz");
    }

    @Test
    void shouldPrintNumberAsBuzz() {
        Assertions.assertEquals(FizzBuzz.printCorrespond(5), "Buzz");
        Assertions.assertEquals(FizzBuzz.printCorrespond(10), "Buzz");
        Assertions.assertEquals(FizzBuzz.printCorrespond(-10), "Buzz");
    }

    @Test
    void shouldPrintNumberAsFizzBuzz() {
        Assertions.assertEquals(FizzBuzz.printCorrespond(0), "FizzBuzz");
        Assertions.assertEquals(FizzBuzz.printCorrespond(15), "FizzBuzz");
        Assertions.assertEquals(FizzBuzz.printCorrespond(-15), "FizzBuzz");
    }

}
