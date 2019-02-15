package tatsy.solicitudes;

import tatsy.vehiculo.Flota;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class Programador {

    private static int minutosDeAntelacion = 15;
    private RepositorioSolicitudes repositorioSolicitudes = new RepositorioSolicitudes();

    //Este metodo se ejecuta en un cron 1 vez por minuto
    public void asignarSolicitudesPendientes() {
        solicitudesPorAsignar().forEach(solicitud -> Flota.getInstancia().asignarSiPuede(solicitud));
    }

    public void reAsignarSolicitudesAsignadas() {
        solicitudesPorAsignar().forEach(solicitud -> Flota.getInstancia().reAsignarSiPuede(solicitud));
    }

    //Este metodo tambien se ejecuta en un cron 1 vez por minuto
    public void cancelarSolicitudesVencidas() {
        solicitudesPorAsignar()
                .stream()
                .filter(this::vencida)
                .forEach(Solicitud::cancelar);
    }

    public List<SolicitudPosterior> solicitudesPorAsignar() {
        return repositorioSolicitudes.getSolicitudesProgramadas().stream()
                .filter(solicitud -> !solicitud.isAsignada())
                .filter(this::proxima)
                .collect(Collectors.toList());
    }

    private boolean vencida(SolicitudPosterior solicitud) {
        return solicitud.getMomento().isAfter(LocalDateTime.now());
    }

    private boolean proxima(SolicitudPosterior solicitud) {
        return solicitud.getMomento().minusMinutes(minutosDeAntelacion).isBefore(LocalDateTime.now());
    }
}
