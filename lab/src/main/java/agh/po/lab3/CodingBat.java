package agh.po.lab3;

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

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.print("Metoda sleepIn\nWynik: " + cb.sleepIn(true, true));
    }
}