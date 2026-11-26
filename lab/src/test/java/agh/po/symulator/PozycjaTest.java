package agh.po.symulator;

import org.junit.Test;

import static org.junit.Assert.*;

public class PozycjaTest {

    @Test
    public void przemiesc() {
        Pozycja p = new Pozycja(0, 0);
        Pozycja cel = new Pozycja(3, 4);

        p.przemiesc(0.1, 20.0, cel);

        assertEquals(1.2, p.getX(), 0.001);
        assertEquals(1.6, p.getY(), 0.001);

        Pozycja p2 = new Pozycja(0, 0);
        Pozycja cel2 = new Pozycja(3, 4);

        p2.przemiesc(0.1, 0, cel);
        assertEquals(0, p.getX(), 0.001);
        assertEquals(0, p.getY(), 0.001);

        Pozycja p3 = new Pozycja(0, 0);
        Pozycja cel3 = new Pozycja(3, 4);

        p3.przemiesc(0.1, -20.0, cel);
        assertEquals(0, p.getX(), 0.001);
        assertEquals(0, p.getY(), 0.001);
    }
}