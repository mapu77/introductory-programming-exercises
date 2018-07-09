package edu.thoughtworks.training;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzShould {

    public static final String FIZZ_BUZZ_RESULT =
            "1\n" +
            "2\n" +
            "Fizz\n" +
            "4\n" +
            "Buzz\n" +
            "Fizz\n" +
            "7\n" +
            "8\n" +
            "Fizz\n" +
            "Buzz\n" +
            "11\n" +
            "Fizz\n" +
            "13\n" +
            "14\n" +
            "FizzBuzz\n" +
            "16\n" +
            "17\n" +
            "Fizz\n" +
            "19\n" +
            "Buzz\n" +
            "Fizz\n" +
            "22\n" +
            "23\n" +
            "Fizz\n" +
            "Buzz\n" +
            "26\n" +
            "Fizz\n" +
            "28\n" +
            "29\n" +
            "FizzBuzz\n" +
            "31\n" +
            "32\n" +
            "Fizz\n" +
            "34\n" +
            "Buzz\n" +
            "Fizz\n" +
            "37\n" +
            "38\n" +
            "Fizz\n" +
            "Buzz\n" +
            "41\n" +
            "Fizz\n" +
            "43\n" +
            "44\n" +
            "FizzBuzz\n" +
            "46\n" +
            "47\n" +
            "Fizz\n" +
            "49\n" +
            "Buzz\n" +
            "Fizz\n" +
            "52\n" +
            "53\n" +
            "Fizz\n" +
            "Buzz\n" +
            "56\n" +
            "Fizz\n" +
            "58\n" +
            "59\n" +
            "FizzBuzz\n" +
            "61\n" +
            "62\n" +
            "Fizz\n" +
            "64\n" +
            "Buzz\n" +
            "Fizz\n" +
            "67\n" +
            "68\n" +
            "Fizz\n" +
            "Buzz\n" +
            "71\n" +
            "Fizz\n" +
            "73\n" +
            "74\n" +
            "FizzBuzz\n" +
            "76\n" +
            "77\n" +
            "Fizz\n" +
            "79\n" +
            "Buzz\n" +
            "Fizz\n" +
            "82\n" +
            "83\n" +
            "Fizz\n" +
            "Buzz\n" +
            "86\n" +
            "Fizz\n" +
            "88\n" +
            "89\n" +
            "FizzBuzz\n" +
            "91\n" +
            "92\n" +
            "Fizz\n" +
            "94\n" +
            "Buzz\n" +
            "Fizz\n" +
            "97\n" +
            "98\n" +
            "Fizz\n" +
            "Buzz";

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

    @Test
    public void return1to100FizzBuzzNumbers() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat("FizzBuzz doesn't work",
                fizzBuzz.fizzBuzz(), is(FIZZ_BUZZ_RESULT));
    }
}
