package edu.thoughtworks.training;

import java.util.ArrayList;
import java.util.Collection;

public class PrimeFactor {
    public Collection<Integer> generate(int input) {
        Collection<Integer> primeFactors = new ArrayList<Integer>();
        for (int i = 2; i <= Math.sqrt(input); ++i) {
            if (input % i == 0) {
                primeFactors.add(i);
                input /= i;
            }

        }
        if (input != 1) primeFactors.add(input);

        return primeFactors;
    }
}
