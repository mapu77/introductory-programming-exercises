package edu.thoughtworks.training;


public class Asterisk {

    private static final String ASTERISK = "*";
    private static final String END_OF_LINE = "\n";
    private static final String SPACE = " ";

    public String printAnAsterisk() {
        return ASTERISK;
    }


    public String printHorizontalLine(int numberOfAsterisks) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numberOfAsterisks; ++i) builder.append(printAnAsterisk());
        return builder.toString();
    }

    public String printVerticalLine(int numberOfLines) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numberOfLines; ++i) builder.append(printAnAsterisk()).append(END_OF_LINE);
        return builder.toString();
    }

    public String printRightTriangle(int numberOfLines) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= numberOfLines; ++i) {
            builder
                    .append(printHorizontalLine(i))
                    .append(END_OF_LINE);
        }
        return builder.toString();
    }

    public String printIsoscelesTriangle(int numberOfLines) {
        int numberOfAsterisks = 2 * numberOfLines - 1;
        StringBuilder builder = new StringBuilder();
        builder
                .append(printIsoscelesTriangleWithInitialSpaces(numberOfLines - 1))
                .append(printHorizontalLine(numberOfAsterisks))
                .append(END_OF_LINE);
        return builder.toString();
    }

    String printSpaces(int numberOfSpaces) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numberOfSpaces; ++i) builder.append(SPACE);
        return builder.toString();
    }

    public String printDiamond(int n) {
        StringBuilder builder = new StringBuilder();
        builder
                .append(printIsoscelesTriangle(n))
                .append(printInvertedIsoscelesTriangleWithInitialSpaces(n - 1));
        return builder.toString();
    }

    String printInvertedIsoscelesTriangleWithInitialSpaces(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            int initialSpaces = i+1;
            int leftAsterisks = 2*(n-i)-1;
            builder
                    .append(printSpaces(initialSpaces))
                    .append(printHorizontalLine(leftAsterisks))
                    .append(END_OF_LINE);
        }
        return builder.toString();
    }

    public String printDiamondWithName(int n, String someName) {
        StringBuilder builder = new StringBuilder();
        builder
                .append(printIsoscelesTriangleWithInitialSpaces(n - 1))
                .append(someName).append(END_OF_LINE)
                .append(printInvertedIsoscelesTriangleWithInitialSpaces(n - 1));
        return builder.toString();
    }

    String printIsoscelesTriangleWithInitialSpaces(int numberOfLines) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numberOfLines; ++i) {
            int initialSpaces = numberOfLines - i;
            int leftAsterisks = 2 * i + 1;
            builder
                    .append(printSpaces(initialSpaces))
                    .append(printHorizontalLine(leftAsterisks))
                    .append(END_OF_LINE);
        }
        return builder.toString();
    }
}
