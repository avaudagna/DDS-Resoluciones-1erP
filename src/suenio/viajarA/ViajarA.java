package suenio.viajarA;

import persona.Persona;
import suenio.Suenio;
import suenio.viajarA.lugar.Lugar;

public class ViajarA extends Suenio {
    private Lugar lugar;

    public ViajarA(Lugar lugar) {
        this.lugar = lugar;
    }

    @Override
    public int getFelicidoniosPara(Persona persona) {
        return lugar.getFelicidoniosDeExito();
    }
}
