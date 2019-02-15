package punto2.salud;

import punto2.Bolsa;
import punto2.Ninio;

public class Sano extends Salud{
    @Override
    public double nivelDeMaldad() {
        return MALDAD_BASE;
    }

    @Override
    public void comerCaramelos(int cantidad, Ninio ninio) throws Bolsa.CaramelosInsuficientesException {
        ninio.disminuirCaramelos(cantidad);
        if(cantidad > 10) {
            ninio.empacharse();
        }
    }
}
