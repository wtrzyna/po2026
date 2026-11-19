package agh.po.symulator;

public class Komponent {
    private String nazwa;
    private double cena;
    private double waga;
    private String producent;
    private String model;

    public Komponent (String nazwa, double cena, double waga, String producent, String model) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.waga = waga;
        this.producent = producent;
        this.model = model;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena () {
        return cena;
    }

    public double getWaga () {
        return waga;
    }

    public String getProducent () {
        return producent;
    }

    public String getModel () {
        return model;
    }

}
