package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent{
    private int aktualnyBieg;
    private int iloscBiegow;
    private int aktualnePrzelozenie;
    private Sprzeglo sprzeglo;

    public SkrzyniaBiegow (String nazwa, double cena, double waga, String producent, String model, int aktualnyBieg, int iloscBiegow, int aktualnePrzelozenie, Sprzeglo sprzeglo) {
        super(nazwa, cena, waga, producent, model);
        this.iloscBiegow = iloscBiegow;
        this.aktualnyBieg = 0;
        this.aktualnePrzelozenie = 0;
        this.sprzeglo = sprzeglo;
    }

    public void zwiekszBieg () {
        if (aktualnyBieg < iloscBiegow && sprzeglo.isStanSprzegla()) {
            aktualnyBieg ++;
        }
    }

    public void zmniejszBieg () {
        if (aktualnyBieg > -1 && sprzeglo.isStanSprzegla()) {
            aktualnyBieg --;
        }
    }

    public int getAktualnyBieg () {
        return aktualnyBieg;
    }

    public int getAktualnePrzelozenie () {
        return aktualnePrzelozenie;
    }

    @Override
    public double getWaga() {
        return super.getWaga() + sprzeglo.getWaga();
    }
}
