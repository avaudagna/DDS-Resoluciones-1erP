package tatsy.solicitudes;

import tatsy.Cliente;

import java.time.LocalDateTime;

public class SolicitudPosterior extends Solicitud{

    private LocalDateTime momento;

    public SolicitudPosterior(Posicion posicion, Cliente cliente, LocalDateTime momento) {
        super(posicion, cliente);
        this.momento = momento;
    }
    public LocalDateTime getMomento() {
        return momento;
    }
}
