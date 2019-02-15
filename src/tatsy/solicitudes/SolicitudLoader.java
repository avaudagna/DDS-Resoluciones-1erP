package tatsy.solicitudes;

import tatsy.vehiculo.Flota;

//Es un facade con los casos de uso de solicitudes actuales y posteriores
public class SolicitudLoader {

    private RepositorioSolicitudes repositorioSolicitudes;

    public SolicitudLoader(RepositorioSolicitudes repositorioSolicitudes) {
        this.repositorioSolicitudes = repositorioSolicitudes;
    }

    //De no asignarse de inmediato, se cancela.
    public void cargarSolicitudInmediata(SolicitudActual solicitudActual) {
        Flota.getInstancia().asignarOCancelar(solicitudActual);
    }

    //Se ejecutaran 1 vez por minuto con el cron del Programador
    public void cargarSolicitudPosterior(SolicitudPosterior solicitudPosterior) {
        repositorioSolicitudes.addSolicitud(solicitudPosterior);
    }
}
