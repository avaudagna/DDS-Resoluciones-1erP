package punto1.venta_de_entradas.reservar.enviar_ticket.adapters.guestern_iunion;
import punto1.venta_de_entradas.Configuracion;
import punto1.venta_de_entradas.comprar.compra.Ticket;
import punto1.venta_de_entradas.reservar.enviar_ticket.EnviadorTicket;
import punto1.venta_de_entradas.reservar.enviar_ticket.Resultado;
import punto1.venta_de_entradas.reservar.enviar_ticket.servicios_externos.guestern_iunion.DireccionYCodigoSecreto;
import punto1.venta_de_entradas.reservar.enviar_ticket.servicios_externos.guestern_iunion.GuesternIunion;
import punto1.venta_de_entradas.reservar.reservador.Usuario;

public class GuesternIunionAdapter implements EnviadorTicket {

    private static String codigoSecreto = Configuracion.codigoSecretoGuesternIunion;
    private GuesternIunion guesternIunion;

    public GuesternIunionAdapter(GuesternIunion guesternIunion) {
        this.guesternIunion = guesternIunion;
    }

    public String getCodigoSecreto() {
        return codigoSecreto;
    }

    @Override
    public void enviarTicket(Ticket ticket, Usuario usuario, Resultado resultado) {
        guesternIunion.doProcesarNuevoEnvio(
                usuario.getNombre(),
                ticket.getId(),
                getDireccionYCodigo(usuario),
                new GuesternIunionResultadoOperacionDecorado(resultado));
    }

    private DireccionYCodigoSecreto getDireccionYCodigo(Usuario usuario) {
        return new DireccionYCodigoSecreto(usuario.getCalle(), usuario.getNumero(), usuario.getCp(), usuario.getCiudad(),
                                    usuario.getProvincia(), getCodigoSecreto());
    }
}
