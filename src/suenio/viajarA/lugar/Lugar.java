package suenio.viajarA.lugar;

public class Lugar {
    private String nombre;
    private int felicidoniosDeExito;

     Lugar(String nombre, int felicidoniosDeExito) {
        this.nombre = nombre;
        this.felicidoniosDeExito = felicidoniosDeExito;
     }

    public String getNombre() {
        return nombre;
    }

    public int getFelicidoniosDeExito() {
        return felicidoniosDeExito;
    }
}
