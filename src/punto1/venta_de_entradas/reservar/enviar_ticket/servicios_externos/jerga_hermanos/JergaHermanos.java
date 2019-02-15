package punto1.venta_de_entradas.reservar.enviar_ticket.servicios_externos.jerga_hermanos;

public interface JergaHermanos {
    int enviar(String idTicket, String destinatario, String calle,
               String numero, String codigoPostal, String ciudad, String provincia);
}
