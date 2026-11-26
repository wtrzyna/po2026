package agh.po.symulator;

public class Samochod {
    private boolean stanWlaczenia;
    private String nrRejestracyjny;
    private String model;
    private double predkoscMax;

    private Silnik silnik;
    private SkrzyniaBiegow skrzyniaBiegow;
    private Pozycja aktualnaPozycja;

    public Samochod(String nrRejestracyjny, String model, double predkoscMax, Silnik silnik, SkrzyniaBiegow skrzyniaBiegow, Pozycja aktualnaPozycja) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.model = model;
        this. predkoscMax = predkoscMax;
        this.silnik = silnik;
        this.skrzyniaBiegow = skrzyniaBiegow;
        this.aktualnaPozycja = aktualnaPozycja;
        stanWlaczenia = false;
    }

    public void wlacz () {
        stanWlaczenia = true;
        silnik.uruchom();
    }

    public void wylacz () {
        stanWlaczenia = false;
        silnik.zatrzymaj();
    }

    public double getWaga () {
        return silnik.getWaga() + skrzyniaBiegow.getWaga();
    }

    /*public void jedzDo (Pozycja cel) {
        double dt = 0.1;
        while (aktualnaPozycja.getX() != cel.getX() || aktualnaPozycja.getY() != cel.getY()) {
            double v = getAktPredkosc();
            if (v <= 0) {
                break;
            }
            aktualnaPozycja.przemiesc(dt, v, cel);
        }
    }*/

    public Pozycja getAktPozycja() {
        return aktualnaPozycja;
    }
}
