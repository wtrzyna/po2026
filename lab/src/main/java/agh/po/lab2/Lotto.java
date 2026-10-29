package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {

        ArrayList<Integer> liczby = new ArrayList<>();
        ArrayList<Integer> liczby_strzel = new ArrayList<>();

        Random l = new Random();
        for (int i = 0; i < 6; i++) {
            Integer x = Integer.parseInt(args[i]);
            liczby_strzel.add(x);

        }

        while (liczby.size() < 6) {
            Integer x = l.nextInt(49)+1;
            if (!liczby.contains(x)) {
                liczby.add(x);
            }
        }

        Integer licz = 0;
        for (int i = 0; i < 6; i++) {
                if (liczby.contains(liczby_strzel.get(i))) {
                    licz = licz + 1;
                }
        }

        System.out.print("Liczby losowe: ");
        System.out.println(liczby);
        System.out.print("Twoje typy: ");
        System.out.println(liczby_strzel);
        System.out.print("Liczba trafionych: ");
        System.out.println(licz);

    }
}
