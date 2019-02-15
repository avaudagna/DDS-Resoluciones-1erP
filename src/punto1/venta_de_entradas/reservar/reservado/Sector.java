package punto1.venta_de_entradas.reservar.reservado;

public class Sector {
    private String tipo;
    private boolean esNocturno;
    private double precio;

    public Sector(String tipo, boolean esNocturno, double precio) {
        this.tipo = tipo;
        this.esNocturno = esNocturno;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean esNocturno() {
        return esNocturno;
    }
}
