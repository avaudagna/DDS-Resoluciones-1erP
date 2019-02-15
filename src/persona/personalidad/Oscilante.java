package persona.personalidad;

import persona.Persona;

public class Oscilante implements Personalidad{

    private Personalidad realista = new Realista();
    private Personalidad alocado = new Alocado();
    private Personalidad actual = realista;


    @Override
    public void cumplirMeta(Persona persona) {
        actual.cumplirMeta(persona);
        invertirPersonalidad();
    }

    private void invertirPersonalidad() {
        actual = actual == realista ? alocado : realista;
    }
}
