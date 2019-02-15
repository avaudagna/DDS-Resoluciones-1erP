package punto1.venta_de_entradas.reservar.notificar;

import punto1.venta_de_entradas.comprar.compra.Ticket;
import punto1.venta_de_entradas.reservar.reserva.Reserva;
import punto1.venta_de_entradas.reservar.reservador.Usuario;
import punto1.venta_de_entradas.servicios_externos.ServicioMailing;

public class NotificarPorMail implements ObservadorReserva {
    @Override
    public void notificarCancelacion(Reserva reserva, Usuario usuario) {
        ServicioMailing.enviarMail(usuario.getMail(), "Cancelacion de Ticket", "...");
    }

    @Override
    public void notificarConfirmacion(Ticket ticket, Usuario usuario) {
        ServicioMailing.enviarMail(usuario.getMail(), "Nueva Compra de Ticket!", "...");
    }
}
