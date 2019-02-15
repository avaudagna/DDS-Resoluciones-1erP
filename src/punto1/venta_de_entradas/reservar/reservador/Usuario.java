package punto1.venta_de_entradas.reservar.reservador;

import punto1.venta_de_entradas.comprar.compra.Ticket;
import punto1.venta_de_entradas.reservar.enviar_ticket.EnviadorTicket;
import punto1.venta_de_entradas.reservar.enviar_ticket.EnviarTicket;
import punto1.venta_de_entradas.reservar.enviar_ticket.Resultado;
import punto1.venta_de_entradas.reservar.notificar.ObservadorReserva;
import punto1.venta_de_entradas.reservar.reserva.Reserva;
import punto1.venta_de_entradas.reservar.reservado.Funcion;
import punto1.venta_de_entradas.reservar.reservado.Sector;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private String provincia;
    private int cp;
    private String ciudad;
    private String calle;
    private int numero;
    private List<Reserva> reservas = new ArrayList<>();
    private String email;

    public Usuario(String nombre, String provincia, int cp,
                   String ciudad, String calle, int numero,
                   String email) {
        this(nombre, email, provincia, cp, ciudad, calle, numero, new ArrayList<>());

    }
    public Usuario(String nombre, String email, String provincia, int cp,
                   String ciudad, String calle, int numero,
                   List<Reserva> reservas) {
        this.nombre = nombre;
        this.email = email;
        this.provincia = provincia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
        this.reservas = reservas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public int getCp() {
        return cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public EnviadorTicket getEnviadorPorCiudad() {
        return EnviadorPorCiudad.getEnviador(getCiudad());
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void cancelarReserva(Reserva reserva) {
        reserva.cancelar(this);
        reservas.remove(reserva);
        //TODO: Subir stock, etc...
    }

    public void reservar(Funcion funcion, Sector sector, List<ObservadorReserva> observadores) {
        agregarReserva(new Reserva(sector, funcion, observadores));
    }

    public void comprar(Reserva reserva, Resultado resultado) {
        //TODO: Generar pagos y si algo sale mal levantar excepcion.
        reserva.confirmar(this, resultado);
        reservas.remove(reserva);
    }

    public String getMail() {
        return email;
    }
}
