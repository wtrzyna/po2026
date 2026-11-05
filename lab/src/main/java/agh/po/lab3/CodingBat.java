package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation) {
            return true;
        }
        if (!weekday) {
            return true;
        }
        return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }

    public String stringTimes(String str, int n) {
        String wynik = "";
        for (int i = 0; i < n; i++) {
            wynik += str;
        }
        return wynik;
    }

    public String stringX(String str) {
        String wynik = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1 || str.charAt(i) != 'x') {
                wynik += str.charAt(i);
            }
        }
        return wynik;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        Map<String, String> wynik = new HashMap<String, String>(map);

        if (wynik.containsKey("a") && wynik.containsKey("b")) {
            if (wynik.get("a").equals(wynik.get("b"))) {
                wynik.remove("a");
                wynik.remove("b");
            }
        }
        return wynik;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.print("Metoda sleepIn\nWynik: " + cb.sleepIn(true, true));
    }
}