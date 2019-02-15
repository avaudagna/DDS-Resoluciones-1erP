package tatsy.vehiculo;

import tatsy.solicitudes.Posicion;
import tatsy.solicitudes.Solicitud;
import tatsy.solicitudes.SolicitudPosterior;

import java.util.List;
import java.util.Optional;

public class Flota {
    private List<Vehiculo> vehiculos;
    private static Flota instancia = null;

    public Flota(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public static Flota getInstancia() {
        if(instancia == null) {
            instancia = new Flota(new RepositorioVehiculos().getAll());
        }
        return instancia;
    }

    public Optional<Vehiculo> vehiculoDisponibleMasCercano(Posicion posicion) {
        return vehiculos.stream()
                .filter(Vehiculo::disponible)
                .filter(vehiculo -> vehiculo.cercano(posicion))
                .findFirst();
    }

    public void asignarOCancelar(Solicitud solicitud) {
        Optional<Vehiculo> vehiculo = vehiculoDisponibleMasCercano(solicitud.getPosicion());
        if(vehiculo.isPresent()) {
            vehiculo.get().asignarse(solicitud);
        } else {
            solicitud.cancelar();

        }
    }

    public void asignarSiPuede(Solicitud solicitud) {
        Optional<Vehiculo> vehiculo = vehiculoDisponibleMasCercano(solicitud.getPosicion());
        if(vehiculo.isPresent()) {
            solicitud.fueAsignada();
            solicitud.setVehiculoAsignado(vehiculo.get());
            vehiculo.get().asignarse(solicitud);
        }
    }

    public void reAsignarSiPuede(SolicitudPosterior solicitud) {
        Optional<Vehiculo> vehiculo = vehiculoDisponibleMasCercanoQue(solicitud.getPosicion(),
                                                                      solicitud.getVehiculoAsignado());
        if(vehiculo.isPresent()) {
            solicitud.getVehiculoAsignado().liberar();
            solicitud.setVehiculoAsignado(vehiculo.get());
            vehiculo.get().asignarse(solicitud);
        }
    }

    private Optional<Vehiculo> vehiculoDisponibleMasCercanoQue(Posicion posicion, Vehiculo vehiculoAsignado) {
        return vehiculoDisponibleMasCercano(posicion)
                .filter(vehiculo -> posicion.menorQue(vehiculoAsignado.getPosicion()));
    }

    public class NoHayVehiculoDisponible extends Exception {
        private Posicion posicion;
        public NoHayVehiculoDisponible(Posicion posicion) {
            this.posicion = posicion;
        }
        @Override
        public String getMessage() {
            return "No se encontro un vehiculo disponible para la posicion : " + posicion;
        }
    }
}
