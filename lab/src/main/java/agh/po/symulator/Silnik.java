package agh.po.symulator;

public class Silnik extends Komponent{
    private int maxObroty;
    private int obroty;

    public Silnik (String nazwa, double cena, double waga, String producent, String model, int maxObroty) {
        super (nazwa, cena, waga, producent, model);
        this.maxObroty = maxObroty;
        obroty = 0;
    }

    public void uruchom () {
        if (obroty == 0) {
            obroty = 800;
        }
    }

    public void zatrzymaj () {
        if (obroty > 0) {
            obroty = 0;
        }
    }

    public void zwiekszObroty (int wartosc) {
        if (obroty > 0 && obroty + wartosc <= maxObroty) {
            obroty += wartosc;
        } else if (obroty > 0) {
            obroty = maxObroty;
        }
    }

    public void zmniejszObroty (int wartosc) {
        if (obroty > 0 && obroty - wartosc >= 800) {
            obroty -= wartosc;
        } else if (obroty > 0) {
            obroty = 800;
        }
    }
}
