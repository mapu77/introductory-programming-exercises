package edu.thoughtworks.training;

public class Asterisk {

    private static final String ASTERISK = "*";

    public String print() {
        return ASTERISK;
    }

    public String print(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<n; ++i) builder.append(print());
        return builder.toString();
    }
}
