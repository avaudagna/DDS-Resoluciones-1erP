package suenio.recibirse;

import persona.Persona;
import suenio.Suenio;

public class Recibirse extends Suenio {

    private Carrera carrera;
    private int felcidonios;

    public Recibirse(Carrera carrera, int felcidonios) {
        this.carrera = carrera;
        this.felcidonios = felcidonios;
    }

    @Override
    public void recompensar(Persona persona) {
        if(persona.leInteresaba(this.carrera)) {
            super.recompensar(persona);
        }
    }

    @Override
    public int getFelicidoniosPara(Persona persona) {
        return felcidonios;
    }
}
