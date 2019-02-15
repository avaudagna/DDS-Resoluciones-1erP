package suenio;

import persona.Persona;

public class ConseguirTrabajo extends Suenio {

    private int sueldo;
    private int felicidonios;

    public ConseguirTrabajo(int sueldo, int felicidonios) {
        this.sueldo = sueldo;
        this.felicidonios = felicidonios;
    }

    @Override
    public void recompensar(Persona persona) {
        super.recompensar(persona);
        persona.ganarPlata(sueldo);
    }

    @Override
    public int getFelicidoniosPara(Persona persona) {
        return felicidonios;
    }
}
