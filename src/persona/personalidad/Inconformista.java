package persona.personalidad;

import persona.Persona;

public class Inconformista implements Personalidad{
    @Override
    public void cumplirMeta(Persona persona) {
        cumplirTodosLosSuenios(persona);
    }

    private void cumplirTodosLosSuenios(Persona persona) {
        persona.getSuenios().forEach(suenio -> suenio.recompensar(persona));
    }
}
