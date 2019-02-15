package punto1.jaloguin.asustador.ninie;

import punto1.jaloguin.elemento.Elemento;

import java.util.List;

public class Ninia extends Ninie{

    public Ninia(List<Elemento> elementos, int edad) {
        super(elementos, edad);
    }

    @Override
    public int factorDeBarba() {
        return 1;
    }
}
