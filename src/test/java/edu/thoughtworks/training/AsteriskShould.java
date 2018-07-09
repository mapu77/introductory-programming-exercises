package edu.thoughtworks.training;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AsteriskShould {

    private static final String VERTICAL_LINE =
            "*\n" +
            "*\n" +
            "*\n";
    private static final String RIGHT_TRIANGLE =
            "*\n" +
            "**\n" +
            "***\n";
    private static final String ISOSCELES_TRIANGLE =
            "   *\n" +
            "  ***\n" +
            " *****\n" +
            "*******\n";

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
                VERTICAL_LINE,
                asterisk.printVerticalLine(n));
    }

    @Test
    public void printARightTriangle() {
        Asterisk asterisk = new Asterisk();
        int n = 3;
        assertEquals("Asterisks don't print a right triangle",
                RIGHT_TRIANGLE,
                asterisk.printRightTriangle(n));
    }

    @Test
    public void printAnIsoscelesTriangle() {
        Asterisk asterisk = new Asterisk();
        int n = 4;
        assertEquals("Asterisks don't print an isosceles triangle",
                ISOSCELES_TRIANGLE,
                asterisk.printIsoscelesTriangle(n));

    }
}