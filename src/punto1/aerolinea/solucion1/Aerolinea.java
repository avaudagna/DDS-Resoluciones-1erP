package punto1.aerolinea.solucion1;

import java.util.List;
import java.util.stream.Collectors;

public class Aerolinea {

    public static List<Aerolinea> getAerolinea() {
        return null;
    }

    public List<Vuelo> getVuelos() {
        return null;
    }

    public List<Vuelo> filtrarVuelos(List<Filtro> filtros) {
        return getAerolinea().stream()
                .flatMap(aerolinea -> aerolinea.getVuelos().stream())
                .filter(v -> filtros.stream().allMatch(f -> f.test(v)))
                .collect(Collectors.toList());
    }
}
