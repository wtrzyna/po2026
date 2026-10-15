package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto_3 {
    public static void main(String[] args) {

        long czas1 = System.currentTimeMillis();

        ArrayList<Integer> liczby = new ArrayList<>();
        ArrayList<Integer> liczby_strzel = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        Random l = new Random();
        for (int i = 0; i < 6; i++) {
            Integer x = scan.nextInt();
            liczby_strzel.add(x);

        }

        for (int i = 0; i < 6; i++) {
            liczby.add(l.nextInt(49)+1);
        }

        Integer prob = 0;
        Integer licz = 0;


        while (licz != 6) {
            licz = 0;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (liczby.get(i) == liczby_strzel.get(j))
                        licz = licz + 1;
                }
            }
            prob = prob + 1;
        }

        long czas2 = System.currentTimeMillis();


        System.out.print("Liczby losowe: ");
        System.out.println(liczby);
        System.out.print("Twoje typy: ");
        System.out.println(liczby_strzel);
        System.out.print("Liczba trafionych: ");
        System.out.println(licz);
        System.out.print("Ilosc prob: ");
        System.out.println(prob);



    }
}
