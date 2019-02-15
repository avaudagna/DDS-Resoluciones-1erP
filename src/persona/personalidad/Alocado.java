package persona.personalidad;

import persona.Persona;
import suenio.Suenio;
import suenio.SuenioVacio;

import java.util.List;

public class Alocado implements Personalidad {
    @Override
    public void cumplirMeta(Persona persona) {
        cumplirSuenioAlAzar(persona);
    }

    private void cumplirSuenioAlAzar(Persona persona) {
        elegirSuenioAlAzar(persona.getSuenios()).recompensar(persona);
    }

    private Suenio elegirSuenioAlAzar(List<Suenio> suenios) {
        return suenios.stream().findFirst().orElseGet(SuenioVacio::new);
    }
}
