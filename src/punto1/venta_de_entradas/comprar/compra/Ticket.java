package punto1.venta_de_entradas.comprar.compra;

import punto1.venta_de_entradas.reservar.reserva.Reserva;

public class Ticket {
    private String id;
    private Reserva reserva;
    private boolean entregado = false;

    @Id //Asumo que este anotation inyecta un valor de id nuevo correcto
    public Ticket(Reserva reserva) {
        this.reserva = reserva;
    }

    public String getId() {
        return id;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public boolean fueEntregado() {
        return entregado;
    }

    public void entregar() {
        entregado = true;
    }

}
