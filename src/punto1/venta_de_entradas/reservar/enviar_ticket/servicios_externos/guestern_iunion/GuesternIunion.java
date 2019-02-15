package punto1.venta_de_entradas.reservar.enviar_ticket.servicios_externos.guestern_iunion;

public interface GuesternIunion {
    void doProcesarNuevoEnvio(String destinatario, String idTicket,
            DireccionYCodigoSecreto direccion, ResultadoOperacion resultado);
}
