package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test
    public void sleepIn() {
        CodingBat cb = new CodingBat();
        assertEquals(true, cb.sleepIn(false, false));
        assertEquals(false, cb.sleepIn(true, false));
        assertEquals(true, cb.sleepIn(false, true));
    }

    @org.junit.Test
    public void monkeyTrouble() {
        CodingBat cb = new CodingBat();
        assertEquals(true, cb.monkeyTrouble(true, true));
        assertEquals(true, cb.monkeyTrouble(false, false));
        assertEquals(false, cb.monkeyTrouble(true, false));
    }

    @org.junit.Test
    public void stringTimes() {
        CodingBat cb = new CodingBat();
        assertEquals("HiHi", cb.stringTimes("Hi", 2));
        assertEquals("HiHiHi", cb.stringTimes("Hi", 3));
        assertEquals("Hi", cb.stringTimes("Hi", 1));
    }

    @org.junit.Test
    public void stringX() {
        CodingBat cb = new CodingBat();
        assertEquals("xHix", cb.stringX("xxHxix"));
        assertEquals("abcd", cb.stringX("abxxxcd"));
        assertEquals("xabcdx", cb.stringX("xabxxxcdx"));
    }
}