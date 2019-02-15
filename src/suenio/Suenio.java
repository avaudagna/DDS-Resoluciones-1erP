package suenio;

import persona.Persona;

public abstract class Suenio {
    public void recompensar(Persona persona) {
        persona.recibirFelicidonios(getFelicidoniosPara(persona));
    }

    public abstract int getFelicidoniosPara(Persona persona);

    public int compararPor(Persona persona, Suenio otro) {
        return this.getFelicidoniosPara(persona) - otro.getFelicidoniosPara(persona);
    }
}
