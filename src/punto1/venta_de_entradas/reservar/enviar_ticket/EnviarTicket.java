package punto1.venta_de_entradas.reservar.enviar_ticket;

import punto1.venta_de_entradas.comprar.compra.Ticket;
import punto1.venta_de_entradas.reservar.reservador.Usuario;

public class EnviarTicket {
    public void ejecutar(Ticket ticket, Usuario usuario, Resultado resultado) {
        usuario.getEnviadorPorCiudad().enviarTicket(ticket, usuario, new Resultado() {
            @Override
            public void exito() {
                ticket.entregar();
                resultado.exito();
            }

            @Override
            public void error() {
                resultado.error();
            }
        });
    }
}
