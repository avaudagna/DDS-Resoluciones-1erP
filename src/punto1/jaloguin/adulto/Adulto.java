package punto1.jaloguin.adulto;

import punto1.jaloguin.asustador.Asustador;

public abstract class Adulto {

    private int caramelos;

    public Adulto(int caramelos) {
        this.caramelos = caramelos;
    }

    public int entregarCaramelos() {
        int caramelosDados = caramelos;
        this.caramelos = 0;
        return caramelosDados;
    }

    protected abstract boolean esAsustable(Asustador asustador);

    public int asustarse(Asustador asustador) {
        return esAsustable(asustador) ? entregarCaramelos() : 0;
    }
}
