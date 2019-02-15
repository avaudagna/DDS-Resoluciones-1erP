package punto1.aerolinea.solucion1.filtro;

import punto1.aerolinea.solucion1.Vuelo;

import java.time.LocalDateTime;
import java.util.function.Predicate;

public class FechaDeLlegada implements Predicate<Vuelo> {

    private LocalDateTime fechaLlegada;

    public FechaDeLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    @Override
    public boolean test(Vuelo vuelo) {
        LocalDateTime fechaLlegadaVuelo = vuelo.getTramos().get(vuelo.getTramos().size()-1).getFechaLlegada();
        return fechaLlegadaVuelo.isBefore(fechaLlegada);
    }
}
