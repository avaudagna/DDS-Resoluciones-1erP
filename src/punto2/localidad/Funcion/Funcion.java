package punto2.localidad.Funcion;

import punto2.Espectaculo;
import punto2.localidad.Funcion.modificador.Modificador;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Funcion {

    private static int HORA_DIURNA_INICIO = 0;
    private static int HORA_DIURNA_FIN = 17;
    private List<Modificador> modificadores;
    private Espectaculo espectaculo;
    private LocalDateTime momento;
    private AtomicInteger ventas; //Porque habra mas de una instancia de Funcion consumiendo este recurso.

    public Funcion(Espectaculo espectaculo, LocalDateTime momento,
                   List<Modificador> modificadores) {
        this.modificadores = modificadores;
        this.espectaculo = espectaculo;
        this.momento = momento;
        this.ventas = new AtomicInteger();
    }

    public boolean esDiurna() {
        return momento.getHour() > HORA_DIURNA_INICIO
                && momento.getHour() < HORA_DIURNA_FIN;
    }

    public void registrarVenta() {
        ventas.addAndGet(1);
    }

    public int localidadesVendidas() {
        return ventas.get();
    }

    public double precio(double precioBase) {
        return modificadores.stream()
                .mapToDouble(modif -> modif.modificar(precioBase, this))
                .sum();
    }
}
