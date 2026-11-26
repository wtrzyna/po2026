package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;

    public Pozycja(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void przemiesc(double dt, double V, Pozycja cel) {
        if (cel == null || V <= 0 || dt <= 0) {
            return;
        }

        double dx = cel.getX() - x;
        double dy = cel.getY() - y;
        double odleglosc = Math.sqrt(dx * dx + dy * dy);

        if (odleglosc == 0) {
            return;
        }

        double dlkroku = V * dt;

        if (dlkroku > odleglosc) {
            dlkroku = odleglosc;
        }

        x += (dx / odleglosc) * dlkroku;
        y += (dy / odleglosc) * dlkroku;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
