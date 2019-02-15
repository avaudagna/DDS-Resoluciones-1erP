package punto1.jaloguin.asustador.legion;

public class ReparticionAlLider implements EstrategiaDeReparticion {
    @Override
    public void repartir(double caramelos, LegionDelTerror legion) throws LegionDelTerror.NoHayLiderException {
        legion.getLider().recibirCaramelos(caramelos);
    }
}
