package edu.thoughtworks.training;


public class Asterisk {

    private static final String ASTERISK = "*";

    public String printAnAsterisk() {
        return ASTERISK;
    }


    public String printHorizontalLine(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; ++i) builder.append(printAnAsterisk());
        return builder.toString();
    }

    public String printVerticalLine(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; ++i) builder.append(printAnAsterisk()).append("\n");
        return builder.toString();
    }

    public String printRightTriangle(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= n; ++i) builder.append(printHorizontalLine(i)).append("\n");
        return builder.toString();
    }

    public String printIsoscelesTriangle(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            int initialSpaces = n - i - 1;
            int leftAsterisks = 2 * i + 1;
            builder.append(printSpaces(initialSpaces)).append(printHorizontalLine(leftAsterisks)).append("\n");
        }

        return builder.toString();
    }

    String printSpaces(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; ++i) builder.append(" ");
        return builder.toString();
    }

    public String printDiamond(int n) {
        return null;
    }
}
