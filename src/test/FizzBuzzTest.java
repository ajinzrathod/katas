package test;

import main.FizzBuzz;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class FizzBuzzTest {
    private FizzBuzz fizzbuzz;

    @BeforeMethod
    public void setUp() {
        fizzbuzz = new FizzBuzz();
    }

    public void fizzBuzz1() {
        assertEquals(fizzbuzz.fizzBuzzFinder("1"), "1");
    }
    public void fizzBuzz2() {
        assertEquals(fizzbuzz.fizzBuzzFinder("2"), "2");
    }
    public void fizzBuzz3() {
        assertEquals(fizzbuzz.fizzBuzzFinder("3"), "Fizz");
    }
    public void fizzBuzz5() {
        assertEquals(fizzbuzz.fizzBuzzFinder("5"), "Buzz");
    }
    public void fizzBuzz15() {
        assertEquals(fizzbuzz.fizzBuzzFinder("15"), "FizzBuzz");
    }
}