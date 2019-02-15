package punto1.venta_de_entradas.reservar.reserva;

import punto1.venta_de_entradas.comprar.compra.Ticket;
import punto1.venta_de_entradas.reservar.enviar_ticket.EnviarTicket;
import punto1.venta_de_entradas.reservar.enviar_ticket.Resultado;
import punto1.venta_de_entradas.reservar.notificar.ObservadorReserva;
import punto1.venta_de_entradas.reservar.reservado.Funcion;
import punto1.venta_de_entradas.reservar.reservado.Sector;
import punto1.venta_de_entradas.reservar.reservador.Usuario;

import java.util.List;

public class Reserva {

    private List<ObservadorReserva> observadoresReserva;
    private boolean retiroPrescencial = false;
    private Sector sector;
    private Funcion funcion;

    public Reserva(Sector sector, Funcion funcion, List<ObservadorReserva> observadoresReserva) {
        this.sector = sector;
        this.funcion = funcion;
        this.observadoresReserva = observadoresReserva;
    }

    public boolean retiroPrescencial() {
        return retiroPrescencial;
    }

    public Sector getSector() {
        return sector;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void addNotificador(ObservadorReserva observadorReserva) {
        this.observadoresReserva.add(observadorReserva);
    }

    public Ticket confirmar(Usuario usuario, Resultado resultado){
        Ticket ticket = new Ticket(this);
        notificarConfirmacion(ticket, usuario);
        if(!retiroPrescencial) {
            new EnviarTicket().ejecutar(ticket, usuario, resultado);
        }
        return ticket;
    }

    public void cancelar(Usuario usuario){
        notificarCancelacion(usuario);
    }

    private void notificarCancelacion(Usuario usuario) {
        this.observadoresReserva.forEach(i -> i.notificarCancelacion(this, usuario));
    }

    private void notificarConfirmacion(Ticket ticket, Usuario usuario) {
        this.observadoresReserva.forEach(i -> i.notificarConfirmacion(ticket, usuario));
    }
}
