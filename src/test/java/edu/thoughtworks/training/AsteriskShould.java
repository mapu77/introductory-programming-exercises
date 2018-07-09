package edu.thoughtworks.training;

import org.junit.Before;
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
    private static final String FOUR_SPACES = "    ";
    private static final String DIAMOND =
            "   *\n" +
            "  ***\n" +
            " *****\n" +
            "*******\n" +
            " *****\n" +
            "  ***\n" +
            "   *\n";
    private static final String INVERTED_ISOSCELES_TRIANGLE =
            " ***\n" +
            "  *\n";
    private static final String DIAMOND_WITH_NAME =
            "  *\n" +
            " ***\n" +
            "Some name\n" +
            " ***\n" +
            "  *\n";

    private Asterisk asterisk;

    @Before
    public void setUp() throws Exception {
        asterisk = new Asterisk();
    }

    @Test
    public void printAnAsterisk() {
        assertEquals("Asterisk is not returning an asterisk", "*", asterisk.printAnAsterisk());
    }

    @Test
    public void printANumberOfAsterisk() {
        int n = 6;
        assertEquals("Asterisk prints less than two asterisks", "******", asterisk.printHorizontalLine(n));
    }

    @Test
    public void printAVerticalLineOfAsterisks() {
        int n = 3;
        assertEquals("Asterisk are not printed in a vertical line",
                VERTICAL_LINE,
                asterisk.printVerticalLine(n));
    }

    @Test
    public void printARightTriangle() {
        int n = 3;
        assertEquals("Asterisks don't print a right triangle",
                RIGHT_TRIANGLE,
                asterisk.printRightTriangle(n));
    }

    @Test
    public void printAnIsoscelesTriangle() {
        int n = 4;
        assertEquals("Asterisks don't print an isosceles triangle",
                ISOSCELES_TRIANGLE,
                asterisk.printIsoscelesTriangle(n));
    }

    @Test
    public void printSpaces() {
        int n = 4;
        assertEquals("Asterisks don't print a line of spaces",
                FOUR_SPACES,
                asterisk.printSpaces(n));
    }

    @Test
    public void printDiamond() {
        int n = 4;
        assertEquals("Asterisks don't print a diamond",
                DIAMOND,
                asterisk.printDiamond(n));
    }

    @Test
    public void printInvertedIsoscelesTriangle() {
        int n = 2;
        assertEquals("Asterisks don't print an inverted isosceles triangle",
                INVERTED_ISOSCELES_TRIANGLE,
                asterisk.printInvertedIsoscelesTriangleWithInitialSpaces(n));
    }

    @Test
    public void printDiamondWithName() {
        int n = 3;
        assertEquals("Asterisks don't print an inverted isosceles triangle",
                DIAMOND_WITH_NAME,
                asterisk.printDiamondWithName(n, "Some name"));
    }
}