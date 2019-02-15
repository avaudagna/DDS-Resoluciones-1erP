package persona;

import persona.personalidad.Personalidad;
import persona.personalidad.Realista;
import suenio.Suenio;
import suenio.recibirse.Carrera;

import java.util.ArrayList;
import java.util.List;

public class PersonaBuilder {
    private List<Suenio> suenios = new ArrayList<>();
    private int cantidadDeHijos = 0;
    private int buenaPlata = 0;
    private List<Carrera> carrerasPendientes = new ArrayList<>();
    private int plataDeseada = 0;
    private Personalidad personalidad = new Realista();

    public void setSuenios(List<Suenio> suenios) {
        this.suenios.addAll(suenios);
    }

    public void setCantidadDeHijos(int cantidadDeHijos) {
        this.cantidadDeHijos = cantidadDeHijos;
    }

    public void setBuenaPlata(int buenaPlata) {
        this.buenaPlata = buenaPlata;
    }

    public void setCarrerasPendientes(List<Carrera> carrerasPendientes) {
        this.carrerasPendientes.addAll(carrerasPendientes);
    }

    public void setPlataDeseada(int plataDeseada) {
        this.plataDeseada = plataDeseada;
    }

    public void setPersonalidad(Personalidad personalidad) {
        this.personalidad = personalidad;
    }
    public Persona construir() {
        return new Persona(suenios, cantidadDeHijos, buenaPlata,
                           carrerasPendientes, plataDeseada, personalidad);
    }
}
