package edu.thoughtworks.training;

public class FizzBuzz {
    private static final String END_OF_LINE = "\n";

    public String represent(int number) {
        StringBuilder representation = new StringBuilder();
        if (isDivisibleBy3(number)) representation.append("Fizz");
        if (isDivisibleBy5(number)) representation.append("Buzz");
        if (!isDivisibleBy3(number) && !isDivisibleBy5(number)) representation.append(number);
        return representation.toString();
    }

    private boolean isDivisibleBy5(int number) {
        return isDivisibleBy(number, 5);
    }

    private boolean isDivisibleBy3(int number) {
        return isDivisibleBy(number, 3);
    }

    private boolean isDivisibleBy(int number, int i) {
        return number % i == 0;
    }

    public String fizzBuzz() {
        StringBuilder fizzBuzz = new StringBuilder();
        for (int i = 1; i <= 100; ++i) fizzBuzz.append(represent(i)).append(END_OF_LINE);
        return fizzBuzz.toString();
    }

}
