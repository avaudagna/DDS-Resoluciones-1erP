package tatsy.medios_de_notification;

import tatsy.vehiculo.Vehiculo;
import tatsy.solicitudes.Solicitud;

public interface MedioDeNotification {
    public void notificarViaje(Vehiculo vehiculo, Solicitud solicitud);
}
