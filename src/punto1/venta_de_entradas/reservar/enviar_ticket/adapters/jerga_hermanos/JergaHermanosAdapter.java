package punto1.venta_de_entradas.reservar.enviar_ticket.adapters.jerga_hermanos;

import punto1.venta_de_entradas.comprar.compra.Ticket;
import punto1.venta_de_entradas.reservar.enviar_ticket.EnviadorTicket;
import punto1.venta_de_entradas.reservar.enviar_ticket.Resultado;
import punto1.venta_de_entradas.reservar.enviar_ticket.servicios_externos.jerga_hermanos.JergaHermanos;
import punto1.venta_de_entradas.reservar.reservador.Usuario;

import java.util.concurrent.CompletableFuture;

public class JergaHermanosAdapter implements EnviadorTicket {
    private JergaHermanos jergaHermanos;

    public JergaHermanosAdapter(JergaHermanos jergaHermanos) {
        this.jergaHermanos = jergaHermanos;
    }

    @Override
    public void enviarTicket(Ticket ticket, Usuario usuario, Resultado resultado) {
        CompletableFuture
            .supplyAsync(() ->
                this.jergaHermanos.enviar(ticket.getId(),
                usuario.getNombre(),
                usuario.getCalle(),
                String.valueOf(usuario.getNumero()),
                String.valueOf(usuario.getCp()),
                usuario.getCiudad(),
                usuario.getProvincia()))
            .thenAccept(respuesta -> {
                if (respuesta == 0) {
                    resultado.exito();
                }
                else {
                    resultado.error();
                }
            });
    }
}
