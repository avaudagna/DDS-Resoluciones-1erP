package punto1.venta_de_entradas.reservar.notificar;

import punto1.venta_de_entradas.reservar.reserva.Reserva;
import punto1.venta_de_entradas.reservar.reservador.Usuario;

public interface ObservarCancelacion {
    void notificarCancelacion(Reserva reserva, Usuario usuario);
}
