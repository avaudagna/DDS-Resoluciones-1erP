package punto1.jaloguin.elemento;

import punto1.jaloguin.asustador.ninie.Ninie;

public class Barba implements Elemento{

    private double longitud;

    public Barba(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public double capacidadDeSusto(Ninie ninie) {
        return longitud * ninie.factorDeBarba();
    }
}
