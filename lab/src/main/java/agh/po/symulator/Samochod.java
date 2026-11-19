package agh.po.symulator;

public class Samochod {
    private boolean stanWlaczenia;
    private String nrRejestracyjny;
    private String model;
    private double predkoscMax;

    private Silnik silnik;
    private SkrzyniaBiegow skrzyniaBiegow;
    private Pozycja aktualnapozycja;

    public Samochod(String nrRejestracyjny, String model, double predkoscMax, Silnik silnik, SkrzyniaBiegow skrzyniaBiegow, Pozycja aktualnaPozycja) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.model = model;
        this. predkoscMax = predkoscMax;
        this.silnik = silnik;
        this.skrzyniaBiegow = skrzyniaBiegow;
        this.aktualnapozycja = aktualnaPozycja;
        stanWlaczenia = 0;
    }

    public void wlacz () {
        stanWlaczenia = 1;
        silnik.uruchom();
    }

    public void wylacz () {
        stanWlaczenia = 0;
        silnik.zatrzymaj();
    }

    public void getWaga () {
        return silnik.getWaga() + skrzyniaBiegow.getWaga();
    }

    public Pozycja getAktPozycja() {
        return aktualnaPozycja;
    }
}
