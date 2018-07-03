package edu.training;

import org.junit.Test;

import static org.junit.Assert.*;

public class AsteriskShould {
    @Test
    public void printAnAsterisk() {
        Asterisk asterisk = new Asterisk();
        assertEquals("Asterisk is not returning an asterisk", "*", asterisk.print());
    }

}