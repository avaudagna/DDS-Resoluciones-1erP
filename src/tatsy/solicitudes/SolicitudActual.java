package tatsy.solicitudes;

import tatsy.Cliente;

/**
 *  Cada pasajero indica dónde debe ser recogido, y mientras están al teléfono, los operadores buscan
 *  en un sistema el vehículo disponible más cercano; si no lo consiguen, se cancela la solicitud.
 */
public class SolicitudActual extends Solicitud {
    public SolicitudActual(Posicion posicion, Cliente cliente) {
        super(posicion, cliente);
    }
}
