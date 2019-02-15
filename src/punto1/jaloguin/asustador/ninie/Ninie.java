package punto1.jaloguin.asustador.ninie;

import punto1.jaloguin.asustador.Asustador;
import punto1.jaloguin.elemento.Elemento;

import java.util.List;

/**
 * Por un lado, un niño tiene una capacidad de asustar (un número)
 * que depende de atributos propios del niño
 * (por ejemplo, su nivel de maldad), y de cero o más elementos que posee.
 */
public abstract class Ninie extends Asustador {
    private List<Elemento> elementos;
    private int edad;
    private int caramelos;

    public Ninie(List<Elemento> elementos, int edad) {
        this.elementos = elementos;
        this.edad = edad;
    }

    @Override
    public double capacidadDeSusto() {
        return elementos.stream()
                .mapToDouble(elemento -> elemento.capacidadDeSusto(this))
                .sum();
    }

    @Override
    public void recibirCaramelos(double porcion) {
        this.caramelos += porcion;
    }

    public abstract int factorDeBarba();

    public List<Elemento> getElementos() {
        return elementos;
    }

    public int getEdad() {
        return edad;
    }

    public int getCaramelos() {
        return caramelos;
    }
}
