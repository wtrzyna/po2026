package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto_3 {
    public static void main(String[] args) {

        ArrayList<Integer> liczby = new ArrayList<>();
        ArrayList<Integer> liczby_strzel = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Integer x = Integer.parseInt(args[i]);
            liczby_strzel.add(x);
        }

        Random l = new Random();
        long prob = 0;
        int licz = 0;
        long czas1 = System.currentTimeMillis();


        while (licz != 6) {
            prob = prob + 1;
            liczby.clear();

            while (liczby.size() < 6) {
                Integer x = l.nextInt(49) + 1;
                    if (!liczby.contains(x)) {
                        liczby.add(x);
                }
            }

            licz = 0;
            for (int i = 0; i < 6; i++) {
                if (liczby.contains(liczby_strzel.get(i))) {
                    licz = licz +1;
                }
            }
        }

        long czas2 = System.currentTimeMillis();
        long lacznyCzas = czas2 - czas1;

        System.out.print("Twoje typy: ");
        System.out.println(liczby_strzel);
        System.out.print("Wylosowane liczby które trafiły: ");
        System.out.println(liczby);
        System.out.print("Ilosc prob: ");
        System.out.println(prob);
        System.out.print("Czas działania: ");
        System.out.println((lacznyCzas / 1000.0) + " s");
    }
}
