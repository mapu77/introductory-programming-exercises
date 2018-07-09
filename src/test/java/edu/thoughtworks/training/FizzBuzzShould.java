package edu.thoughtworks.training;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzShould {
    @Test
    public void returnFizzWhenNumberIsDivisibleBy3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat("FizzBuzz doesn't return Fizz on multiples of 3",
                fizzBuzz.represent(3), is("Fizz"));
    }

    @Test
    public void returnBuzzWhenNumberIsDivisibleBy5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat("FizzBuzz doesn't return Buzz on multiples of 5",
                fizzBuzz.represent(5), is("Buzz"));
    }
}
