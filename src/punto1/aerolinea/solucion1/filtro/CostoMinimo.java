package punto1.aerolinea.solucion1.filtro;

import punto1.aerolinea.solucion1.Vuelo;

import java.util.function.Predicate;

public class CostoMinimo implements Predicate<Vuelo> {

    private int costoMinimo;

    public CostoMinimo(int costoMinimo) {
        this.costoMinimo = costoMinimo;
    }

    @Override
    public boolean test(Vuelo vuelo) {
        return vuelo.getCosto() < costoMinimo;
    }
}
