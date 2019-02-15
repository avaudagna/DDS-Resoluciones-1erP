package persona;

import persona.personalidad.Personalidad;
import suenio.SuenioVacio;
import suenio.recibirse.Carrera;
import suenio.Suenio;
import suenio.viajarA.ViajarAFactory;

import java.util.List;

public class Persona {
    private List<Suenio> suenios;
    private int cantidadDeHijos;
    private int buenaPlataInicial;
    private List<Carrera> carrerasPendientes;
    private int felicidonios;
    private int plataDeseada;
    private Personalidad personalidad;

    public Persona(List<Suenio> suenios, int cantidadDeHijos,
                   int buenaPlataInicial, List<Carrera> carrerasPendientes,
                   int plataDeseada, Personalidad personalidad) {
        this.suenios = suenios;
        this.cantidadDeHijos = cantidadDeHijos;
        this.buenaPlataInicial = buenaPlataInicial;
        this.carrerasPendientes = carrerasPendientes;
        this.felicidonios = 0;
        this.plataDeseada = plataDeseada;
        this.personalidad = personalidad;
    }

    public List<Suenio> getSuenios() {
        return suenios;
    }

    public void recibirFelicidonios(int felicidonios) {
        this.felicidonios += felicidonios;
        validarSuenioPrioritario();
    }

    private void validarSuenioPrioritario() {
        if(getFelicidonios() > 100) {
            suenios.sort((s1, s2) -> s1.compararPor(this, s2));
        }
    }

    public int getCantidadDeHijos() {
        return cantidadDeHijos;
    }

    public void recibirNuevoHijo() {
        this.cantidadDeHijos++;
    }

    public int getFelicidonios() {
        return felicidonios;
    }

    public int buenaPlata() {
        switch (cantidadDeHijos) {
            case 0:
            case 1:
            case 2:
                return buenaPlataInicial = buenaPlataInicial * 3;
            default:
                return buenaPlataInicial = buenaPlataInicial * 2;
        }
    }

    private void validarPlataDeseada(int plata) {
        if(plata == plataDeseada) {
            plataDeseada = plataDeseada * 2;
        }
    }

    private void validarViajeARio(int plata) {
        if(plata > 10000) {
            suenios.add(ViajarAFactory.getViajeARio());
        }
    }

    public void ganarPlata(int plata) {
        validarPlataDeseada(plata);
        validarViajeARio(plata);
    }

    public void ganoPlataBuscada() {
        buenaPlataInicial = buenaPlataInicial * 2;
    }

    public boolean leInteresaba(Carrera carrera) {
        return carrerasPendientes.contains(carrera);
    }
}
