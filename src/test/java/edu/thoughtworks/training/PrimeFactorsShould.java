package edu.thoughtworks.training;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrimeFactorsShould {

    private int input;
    private Collection<Integer> expected;

    public PrimeFactorsShould(int input, Collection<Integer> expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "PrimeFactor({0})={1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, Collections.emptyList()},
                {2, Collections.singletonList(2)},
                {4, Arrays.asList(2, 2)},
                {30, Arrays.asList(2, 3, 5)},
        });
    }

    @Test
    public void generatePrimeFactors() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(expected, primeFactor.generate(input));
    }
}
