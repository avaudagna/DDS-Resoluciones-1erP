package punto1.aerolinea.solucion1;

import java.util.List;

public class Vuelo {
    private Aerolinea aerolinea;
    private List<Tramo> tramos;
    private String origen;
    private String destino;
    private double costo;

    public Vuelo(Aerolinea aerolinea, List<Tramo> tramos, String origen,
                 String destino, double costo) {
        this.aerolinea = aerolinea;
        this.tramos = tramos;
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public List<Tramo> getTramos() {
        return tramos;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getCosto() {
        return costo;
    }
}
