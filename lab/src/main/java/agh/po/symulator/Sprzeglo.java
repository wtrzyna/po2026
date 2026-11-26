package agh.po.symulator;

public class Sprzeglo extends Komponent{
    private boolean stanSprzegla;

    public Sprzeglo (String nazwa, double cena, double waga, String producent, String model, boolean stanSprzegla) {
        super(nazwa, cena, waga, producent, model);
        stanSprzegla = false;
    }

    public void wcisnij() {
        stanSprzegla = true;
    }

    public void zwolnij () {
        stanSprzegla = false;
    }

    public boolean isStanSprzegla () {
        return stanSprzegla;
    }
}
