package tatsy.solicitudes;

import tatsy.Cliente;
import tatsy.vehiculo.Vehiculo;

public class Solicitud {
    private Posicion posicion;
    private Cliente cliente;
    private boolean asignada;
    private Vehiculo vehiculoAsignado;

    public Solicitud(Posicion posicion, Cliente cliente) {
        this.posicion = posicion;
        this.cliente = cliente;
        this.asignada = false;
        this.vehiculoAsignado = null;
    }

    public boolean isAsignada() {
        return asignada;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void cancelar() {
        cliente.notificarCancelacion();
    }

    public void fueAsignada() {
        asignada = true;
    }

    public Vehiculo getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    public void setVehiculoAsignado(Vehiculo vehiculoAsignado) {
        this.vehiculoAsignado = vehiculoAsignado;
    }
}
