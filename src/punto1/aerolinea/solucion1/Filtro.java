package punto1.aerolinea.solucion1;

import java.util.function.Predicate;

public class Filtro implements Predicate<Vuelo> {
    @Override
    public boolean test(Vuelo vuelo) {
        return false;
    }
}
