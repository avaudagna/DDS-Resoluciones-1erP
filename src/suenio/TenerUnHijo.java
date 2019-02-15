package suenio;

import persona.Persona;

public class TenerUnHijo extends Suenio {

    private static int felicidoniosMaximos = 55;
    private static int factorDeEntusiasmo = 10;

    @Override
    public void recompensar(Persona persona) {
        super.recompensar(persona);
        persona.recibirNuevoHijo();
    }

    @Override
    public int getFelicidoniosPara(Persona persona) {
        return felicidoniosMaximos - persona.getCantidadDeHijos() * factorDeEntusiasmo;
    }
}
