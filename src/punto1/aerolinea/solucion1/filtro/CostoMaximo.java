package punto1.aerolinea.solucion1.filtro;

import punto1.aerolinea.solucion1.Vuelo;

import java.util.function.Predicate;

public class CostoMaximo implements Predicate<Vuelo> {

    private int costoMaximo;

    public CostoMaximo(int costoMaximo) {
        this.costoMaximo = costoMaximo;
    }

    @Override
    public boolean test(Vuelo vuelo) {
        return vuelo.getCosto() < costoMaximo;
    }
}
