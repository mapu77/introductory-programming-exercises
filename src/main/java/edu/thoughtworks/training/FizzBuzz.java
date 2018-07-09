package edu.thoughtworks.training;

public class FizzBuzz {
    public String represent(int number) {
        String representation = "";
        if (isDivisibleBy3(number)) representation += "Fizz";
        if (isDivisibleBy5(number)) representation += "Buzz";
        if (!isDivisibleBy3(number) && !isDivisibleBy5(number)) representation = String.valueOf(number);
        return representation;
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
        return null;
    }
}
