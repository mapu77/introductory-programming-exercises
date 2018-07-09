package edu.thoughtworks.training;

import java.util.ArrayList;
import java.util.Collection;

public class PrimeFactor {

    private static final int FIRST_PRIME = 2;

    public Collection<Integer> generate(int number) {
        Collection<Integer> primeFactors = new ArrayList<>();
        generate(number, FIRST_PRIME,primeFactors);
        return primeFactors;
    }

    private void generate(final int number, final int possiblePrimeFactor, final Collection<Integer> primeFactors) {
        if (number != 1) {
            if (isDivisibleBy(number, possiblePrimeFactor)) {
                primeFactors.add(possiblePrimeFactor);
                generate(number/possiblePrimeFactor, possiblePrimeFactor, primeFactors);
            } else {
                generate(number, possiblePrimeFactor+1, primeFactors);
            }
        }
    }

    private boolean isDivisibleBy(final int number, final int possiblePrimeFactor) {
        return number % possiblePrimeFactor == 0;
    }
}
