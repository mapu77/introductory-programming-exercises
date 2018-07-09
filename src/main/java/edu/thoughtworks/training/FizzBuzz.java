package edu.thoughtworks.training;

public class FizzBuzz {
    public String represent(int number) {
        String representation = new String();
        if (number % 3 == 0) representation += "Fizz";
        if (number % 5 == 0) representation += "Buzz";
        return representation;
    }
}
