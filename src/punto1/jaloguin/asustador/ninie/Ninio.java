package punto1.jaloguin.asustador.ninie;

import punto1.jaloguin.elemento.Elemento;

import java.util.List;

public class Ninio extends Ninie {

    public Ninio(List<Elemento> elementos, int edad) {
        super(elementos, edad);
    }

    @Override
    public int factorDeBarba() {
        return 0;
    }
}
