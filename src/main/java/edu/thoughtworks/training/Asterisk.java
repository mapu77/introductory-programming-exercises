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
}
