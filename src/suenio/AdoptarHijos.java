package suenio;

import persona.Persona;

public class AdoptarHijos extends Suenio {
    private int cantidad;
    private int felicidonios;

    public AdoptarHijos(int cantidad, int felicidonios) {
        this.cantidad = cantidad;
        this.felicidonios = felicidonios;
    }

    @Override
    public void recompensar(Persona persona) {
        super.recompensar(persona);
        recibirHijos(persona);
    }

    private void recibirHijos(Persona persona) {
        for(int i = 0; i<cantidad; i++) {
            persona.recibirNuevoHijo();
        }
    }

    @Override
    public int getFelicidoniosPara(Persona persona) {
        return felicidonios;
    }
}
