package punto2.localidad;

import punto2.localidad.Funcion.Funcion;
import punto2.localidad.Funcion.sector.Sector;

public class Localidad {
    private Sector sector;
    private Funcion funcion;

    public LocalidadBuilder builder() {
        return new LocalidadBuilder();
    }

    Localidad(Sector sector, Funcion funcion) {
        this.sector = sector;
        this.funcion = funcion;
    }

    public double precio() {
        return funcion.precio(sector.costoSector(funcion.esDiurna()));
    }
}
