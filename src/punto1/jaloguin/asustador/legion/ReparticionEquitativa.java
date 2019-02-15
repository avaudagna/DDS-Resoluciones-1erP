package punto1.jaloguin.asustador.legion;

public class ReparticionEquitativa implements EstrategiaDeReparticion {
    @Override
    public void repartir(double caramelos, LegionDelTerror legion) {
        double porcion = caramelos / legion.getAsustadores().size();
        legion.getAsustadores().forEach(asustador -> asustador.recibirCaramelos(porcion));
    }
}
