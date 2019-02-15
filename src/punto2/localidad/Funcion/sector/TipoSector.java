package punto2.localidad.Funcion.sector;

public enum TipoSector {
    VIP(180, 250), PLATEA(100, 170), POPULAR(50, 180);
    private int precioDiurno;
    private int precioNocturno;

    TipoSector(int precioDiurno, int precioNocturno) {
        this.precioDiurno = precioDiurno;
        this.precioNocturno = precioNocturno;
    }

    public int precioDiurno() {
        return precioDiurno;
    }
    public int precioNocturno() {
        return precioNocturno;
    }
}
