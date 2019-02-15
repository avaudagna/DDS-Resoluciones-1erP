package punto1.venta_de_entradas.reservar.notificar;

import punto1.venta_de_entradas.comprar.compra.Ticket;
import punto1.venta_de_entradas.reservar.reserva.Reserva;
import punto1.venta_de_entradas.reservar.reservador.Usuario;

public class GeneradorDeMetricas implements ObservadorReserva {

    @Override
    public void notificarCancelacion(Reserva reserva, Usuario usuario) {

    }

    @Override
    public void notificarConfirmacion(Ticket ticket, Usuario usuario) {

    }
}
