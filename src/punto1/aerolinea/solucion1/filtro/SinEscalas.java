package punto1.aerolinea.solucion1.filtro;

import punto1.aerolinea.solucion1.Vuelo;

import java.util.function.Predicate;

public class SinEscalas implements Predicate<Vuelo> {

    @Override
    public boolean test(Vuelo vuelo) {
        return vuelo.getTramos().size() == 1;
    }
}
