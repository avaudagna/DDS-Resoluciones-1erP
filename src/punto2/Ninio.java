package punto2;

import punto2.cuidador.Cuidador;
import punto2.salud.Empachado;
import punto2.salud.EnCama;
import punto2.salud.Salud;
import punto2.salud.Sano;

import java.util.List;

public class Ninio {

    private Bolsa bolsa;
    private Salud salud;
    List<Cuidador> cuidadores;

    public void setSalud(Salud salud) {
        this.salud = salud;
    }

    public void agregarCaramelos(int cantidadNueva) throws Bolsa.BolsaSobrepasadaException {
        bolsa.agregarCaramelos(cantidadNueva);
    }

    public void disminuirCaramelos(int cantidad) throws Bolsa.CaramelosInsuficientesException {
        bolsa.disminuirCaramelos(cantidad);
    }

    public double nivelDeMaldad() {
        return salud.nivelDeMaldad();
    }

    public void comerCaramelos(int cantidad) throws Bolsa.CaramelosInsuficientesException {
        salud.comerCaramelos(cantidad, this);
    }

    public void empacharse() {
        setSalud(new Empachado());
        cuidadores.forEach(c -> c.notificarEmpache(this));
    }

    public void estarEnCama() {
        setSalud(new EnCama());
    }

    public void tomarHepatalgina() {
        setSalud(new Sano());
    }
}
