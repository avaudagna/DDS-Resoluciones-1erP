package punto2.salud;

import punto2.Bolsa;
import punto2.Ninio;

public class EnCama extends Salud {
    @Override
    public double nivelDeMaldad() {
        return 0;
    }

    @Override
    public void comerCaramelos(int cantidad, Ninio ninio) throws Bolsa.CaramelosInsuficientesException {

    }
}
