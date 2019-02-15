package punto2.salud;

import punto2.Bolsa;
import punto2.Ninio;

public abstract class Salud {

    protected static int MALDAD_BASE = 1;

    public abstract double nivelDeMaldad();

    public abstract void comerCaramelos(int cantidad, Ninio ninio) throws Bolsa.CaramelosInsuficientesException;
}
