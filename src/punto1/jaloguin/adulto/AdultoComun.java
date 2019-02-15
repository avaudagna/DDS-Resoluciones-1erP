package punto1.jaloguin.adulto;

import punto1.jaloguin.asustador.Asustador;
import punto1.jaloguin.asustador.ninie.Ninie;

public class AdultoComun extends Adulto {

    private int tolerancia;

    public AdultoComun(int caramelos, int tolerancia) {
        super(caramelos);
        this.tolerancia = tolerancia;
    }

    @Override
    public boolean esAsustable(Asustador asustador) {
        return getTolerancia() < asustador.capacidadDeSusto();
    }

    public int getTolerancia() {
        return tolerancia;
    }
}
