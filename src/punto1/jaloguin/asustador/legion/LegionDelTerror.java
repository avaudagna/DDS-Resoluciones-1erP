package punto1.jaloguin.asustador.legion;

import punto1.jaloguin.asustador.Asustador;

import java.util.List;

//Composite : puede tener tanto Ninies como Legiones en su lista de Asustadores.
public class LegionDelTerror extends Asustador {

    private List<Asustador> asustadores;
    private EstrategiaDeReparticion estrategiaDeReparticion;

    public LegionDelTerror(List<Asustador> asustadores) {
        this.asustadores = asustadores;
    }

    public List<Asustador> getAsustadores() {
        return asustadores;
    }

    @Override
    public double capacidadDeSusto() {
        return asustadores.stream().mapToDouble(Asustador::capacidadDeSusto).sum();
    }

    @Override
    public int getCaramelos() {
        return asustadores.stream().mapToInt(Asustador::getCaramelos).sum();
    }

    @Override
    public void recibirCaramelos(double caramelos) {
        try {
            estrategiaDeReparticion.repartir(caramelos, this);
        } catch (NoHayLiderException e) {
            //TODO: Hacer algo para el caso que no hay lider
            e.printStackTrace();
        }
    }

    public Asustador getLider() throws NoHayLiderException {
        return asustadores.stream()
                .max(new Asustador.MasFuerteComparator())
                .orElseThrow(NoHayLiderException::new);
    }

    public class NoHayLiderException extends Exception {
        @Override
        public String getMessage() {
            return "La legion no tiene lider";
        }
    }
}
