package punto1.venta_de_entradas.reservar.notificar;

import punto1.venta_de_entradas.comprar.compra.Ticket;
import punto1.venta_de_entradas.reservar.reserva.Reserva;
import punto1.venta_de_entradas.reservar.reservador.Usuario;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Log implements ObservadorReserva {

    private Logger logger;

    public Log(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void notificarCancelacion(Reserva reserva, Usuario usuario) {
        logger.log(Level.INFO, "Cancelacion - " + reserva.toString() + "," + usuario.toString());
    }

    @Override
    public void notificarConfirmacion(Ticket ticket, Usuario usuario) {
        logger.log(Level.INFO, "Confirmacion - " + ticket.toString() + "," + usuario.toString());
    }
}
