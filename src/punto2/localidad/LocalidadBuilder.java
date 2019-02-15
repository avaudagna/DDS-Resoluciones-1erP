package punto2.localidad;

import punto2.Espectaculo;
import punto2.localidad.Funcion.RepositorioFuncion;
import punto2.localidad.Funcion.sector.Sector;
import punto2.localidad.Funcion.sector.TipoSector;

import java.time.LocalDateTime;

public class LocalidadBuilder {

    private Espectaculo espectaculo;
    private TipoSector tipoSector;
    private LocalDateTime momento;
    private RepositorioFuncion repositorioFuncion = new RepositorioFuncion();

    LocalidadBuilder() {

    }

    public void espectaculo(Espectaculo espectaculo) {
        this.espectaculo = espectaculo;
    }

    public void tipoSector(TipoSector tipoSector) {
        this.tipoSector = tipoSector;
    }

    public void momento(LocalDateTime momento) {
        this.momento = momento;
    }

    public Localidad construir() {
        return new Localidad(
                new Sector(tipoSector),
                repositorioFuncion.getFuncion(espectaculo, momento)
        );
    }
}
