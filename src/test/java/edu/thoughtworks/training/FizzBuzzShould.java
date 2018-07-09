package edu.thoughtworks.training;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzShould {
    @Test
    public void returnFizzWhenNumberIsDivisibleBy3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat("FizzBuzz doesn't return Fizz on multiples of 3",
                fizzBuzz.represent(9), is("Fizz"));
    }

    @Test
    public void returnBuzzWhenNumberIsDivisibleBy5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat("FizzBuzz doesn't return Buzz on multiples of 5",
                fizzBuzz.represent(25), is("Buzz"));
    }

    @Test
    public void returnFizzBuzzWhenNumberIsBothDivisibleBy3And5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat("FizzBuzz doesn't return FizzBuzz on multiples of 3 and 5",
                fizzBuzz.represent(15), is("FizzBuzz"));
    }

    @Test
    public void returnItselfWhenNumberNotDivisibleBy3Or5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat("FizzBuzz doesn't return number when number is not divisible by 3 or 5",
                fizzBuzz.represent(8), is("8"));

    }
}
