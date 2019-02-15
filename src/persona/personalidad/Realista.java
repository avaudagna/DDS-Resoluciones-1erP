package persona.personalidad;

import persona.Persona;
import suenio.Suenio;
import suenio.SuenioVacio;

public class Realista implements Personalidad {
    @Override
    public void cumplirMeta(Persona persona) {
        cumplirSuenioMasImportante(persona);
    }

    private void cumplirSuenioMasImportante(Persona persona) {
        getSuenioMasImportante(persona).recompensar(persona);
    }

    private Suenio getSuenioMasImportante(Persona persona) {
        return persona.getSuenios()
                .stream()
                .max((s1, s2) -> s1.compararPor(persona, s2))
                .orElseGet(SuenioVacio::new);
    }

}
