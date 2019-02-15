package punto2.salud;

import punto2.Bolsa;
import punto2.Ninio;

public class Empachado extends Salud {
    @Override
    public double nivelDeMaldad() {
        return MALDAD_BASE/2;
    }

    @Override
    public void comerCaramelos(int cantidad, Ninio ninio) throws Bolsa.CaramelosInsuficientesException {
        ninio.disminuirCaramelos(cantidad);
        if(cantidad > 5) {
            ninio.estarEnCama();
        }
    }
}
