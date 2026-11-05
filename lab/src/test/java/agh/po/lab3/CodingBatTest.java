package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

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

    @org.junit.Test
    public void mapAB2() {
        CodingBat cb = new CodingBat();
        Map<String, String> wejscie1 = new HashMap<String, String>(Map.of("a", "aaa", "b", "aaa", "c", "cake"));
        Map<String, String> oczek1 = Map.of("c", "cake");
        Map<String, String> wejscie2 = new HashMap<String, String>(Map.of("a", "aaa", "b", "bbb"));
        Map<String, String> oczek2 = Map.of("a", "aaa", "b", "bbb");
        Map<String, String> wejscie3 = new HashMap<String, String>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"));
        Map<String, String> oczek3 = Map.of("a", "aaa", "b", "bbb", "c", "aaa");

        assertEquals(oczek1, cb.mapAB2(wejscie1));
        assertEquals(oczek2, cb.mapAB2(wejscie2));
        assertEquals(oczek3, cb.mapAB2(wejscie3));
    }

    @org.junit.Test
    public void wordCount() {
        CodingBat cb = new CodingBat();
        String[] wejscie1 = {"a", "b", "a", "c", "b"};
        Map<String, Integer> oczek1 = new HashMap<>(Map.of("a", 2, "b", 2, "c", 1));
        String[] wejscie2 = {"c", "b", "a"};
        Map<String, Integer> oczek2 = new HashMap<>(Map.of("a", 1, "b", 1, "c", 1));
        String[] wejscie3 = {"c", "c", "c", "c"};
        Map<String, Integer> oczek3 = new HashMap<>(Map.of("c", 4));

        assertEquals(oczek1, cb.wordCount(wejscie1));
        assertEquals(oczek2, cb.wordCount(wejscie2));
        assertEquals(oczek3, cb.wordCount(wejscie3));
    }
}