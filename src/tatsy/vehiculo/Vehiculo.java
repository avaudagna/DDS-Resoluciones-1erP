package tatsy.vehiculo;

import tatsy.medios_de_notification.MedioDeNotification;
import tatsy.solicitudes.Posicion;
import tatsy.solicitudes.Solicitud;

import java.util.List;

public class Vehiculo {
    private Posicion posicion;
    private boolean libre = true;
    private List<MedioDeNotification> mediosDeNotification;

    public void ocupar() {
        libre = false;
    }

    public void liberar() {
        libre = true;
    }

    public boolean cercano(Posicion posicion) {
        return true;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void asignarse(Solicitud solicitud) {
        mediosDeNotification.forEach(
                medioDeNotification -> medioDeNotification.notificarViaje(this, solicitud)
        );
    }

    public boolean disponible() {
        return libre;
    }
}
