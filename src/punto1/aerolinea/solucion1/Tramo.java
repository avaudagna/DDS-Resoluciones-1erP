package punto1.aerolinea.solucion1;

import java.time.LocalDateTime;

public class Tramo {
    private String aeropuertoSalida;
    private String aeropuertoLlegada;
    private LocalDateTime fechaSalida;
    private LocalDateTime fechaLlegada;

    public Tramo(String aeropuertoSalida, String aeropuertoLlegada,
                 LocalDateTime fechaSalida, LocalDateTime fechaLlegada) {
        this.aeropuertoSalida = aeropuertoSalida;
        this.aeropuertoLlegada = aeropuertoLlegada;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    public String getAeropuertoSalida() {
        return aeropuertoSalida;
    }

    public String getAeropuertoLlegada() {
        return aeropuertoLlegada;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }
}
