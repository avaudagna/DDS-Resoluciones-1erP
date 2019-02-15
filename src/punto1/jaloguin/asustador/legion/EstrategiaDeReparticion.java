package punto1.jaloguin.asustador.legion;

public interface EstrategiaDeReparticion {
    void repartir(double caramelos, LegionDelTerror legion) throws LegionDelTerror.NoHayLiderException;
}
