package edu.thoughtworks.training;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AsteriskShould {
    @Test
    public void printAnAsterisk() {
        Asterisk asterisk = new Asterisk();
        assertEquals("Asterisk is not returning an asterisk", "*", asterisk.printAnAsterisk());
    }

    @Test
    public void printANumberOfAsterisk() {
        Asterisk asterisk = new Asterisk();
        int n = 6;
        assertEquals("Asterisk prints less than two asterisks", "******", asterisk.printHorizontalLine(n));
    }

    @Test
    public void printAVerticalLineOfAsterisks() {
        Asterisk asterisk = new Asterisk();
        int n = 3;
        assertEquals("Asterisk are not printed in a vertical line",
                  "*\n" +
                        "*\n" +
                        "*\n",
                asterisk.printVerticalLine(n));
    }
}