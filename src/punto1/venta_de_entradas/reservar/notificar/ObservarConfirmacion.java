package punto1.venta_de_entradas.reservar.notificar;

import punto1.venta_de_entradas.comprar.compra.Ticket;
import punto1.venta_de_entradas.reservar.reservador.Usuario;


public interface ObservarConfirmacion {
    void notificarConfirmacion(Ticket ticket, Usuario usuario);
}
