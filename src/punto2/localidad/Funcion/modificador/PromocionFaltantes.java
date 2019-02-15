package punto2.localidad.Funcion.modificador;

import punto2.localidad.Funcion.Funcion;

public class PromocionFaltantes implements Modificador {

    private static double factorDeModificacion = 0.6;
    @Override
    public double modificar(double precioBase, Funcion funcion) {
        return funcion.localidadesVendidas() < 10
                ? precioBase * factorDeModificacion
                : precioBase;
    }
}
