package tatsy.solicitudes;

import java.util.Arrays;
import java.util.List;

public class RepositorioSolicitudes {
    private List<SolicitudPosterior> solicitudes;

    public List<SolicitudPosterior> getSolicitudesProgramadas() {
        return solicitudes;
    }

    public void addSolicitud(SolicitudPosterior solicitudPosterior) {
        solicitudes.add(solicitudPosterior);
    }
}
