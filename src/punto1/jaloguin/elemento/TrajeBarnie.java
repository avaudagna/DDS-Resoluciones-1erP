package punto1.jaloguin.elemento;

import punto1.jaloguin.asustador.ninie.Ninie;

public class TrajeBarnie implements Elemento {

    private int nivelDeSusto;

    public TrajeBarnie(int nivelDeSusto) {
        this.nivelDeSusto = nivelDeSusto;
    }

    @Override
    public double capacidadDeSusto(Ninie ninie) {
        return nivelDeSusto * ninie.getEdad();
    }
}
