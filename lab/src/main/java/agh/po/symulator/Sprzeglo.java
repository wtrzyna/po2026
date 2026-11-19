package agh.po.symulator;

public class Sprzeglo extends Komponent{
    private boolean stanSprzegla;

    public Sprzeglo (String nazwa, double cena, double waga, String producent, String model, boolean stanSprzegla) {
        super(nazwa, cena, waga, producent, model);
        stanSprzegla = 0;
    }

    public void wcisnij() {
        stanSprzegla = 1;
    }

    public void zwolnij () {
        stanSprzegla = 0;
    }

    public boolean isStanSprzegla () {
        return stanSprzegla;
    }
}
