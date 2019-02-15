package punto1.jaloguin.adulto;

import punto1.jaloguin.asustador.Asustador;

public class AdultoNecio extends Adulto {

    public AdultoNecio(int caramelos) {
        super(caramelos);
    }

    @Override
    protected boolean esAsustable(Asustador asustador) {
        return false;
    }
}
