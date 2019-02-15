package punto2.localidad.Funcion.sector;

public class Sector {
    private TipoSector tipo;
    public Sector(TipoSector tipo) {
        this.tipo = tipo;
    }
    public TipoSector getTipo() {
        return tipo;
    }
    public double costoSector(boolean diurno) {
        return diurno ? tipo.precioDiurno() : tipo.precioNocturno();
    }
}
