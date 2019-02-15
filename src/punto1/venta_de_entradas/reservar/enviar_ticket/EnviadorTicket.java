package punto1.venta_de_entradas.reservar.enviar_ticket;

import punto1.venta_de_entradas.comprar.compra.Ticket;
import punto1.venta_de_entradas.reservar.reservador.Usuario;

public interface EnviadorTicket {
    void enviarTicket(Ticket ticket, Usuario usuario, Resultado resultado);
}
