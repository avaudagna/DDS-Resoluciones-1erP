package punto1.venta_de_entradas.reservar.reservado;

import java.time.LocalDateTime;

public class Funcion {
    private LocalDateTime momento;
    private double factorDecotizacionHoraria;
    private Sector sector;
    private Espectaculo espectaculo;

    public Funcion(LocalDateTime momento, double factorDecotizacionHoraria,
                   Sector sector) {
        this.momento = momento;
        this.factorDecotizacionHoraria = factorDecotizacionHoraria;
        this.sector = sector;
    }

    public double getPrecio() {
        return sector.getPrecio() * factorDecotizacionHoraria;
    }
}
