package punto1.jaloguin.asustador;

import punto1.jaloguin.adulto.Adulto;

import java.util.Comparator;

public abstract class Asustador {

    public abstract double capacidadDeSusto();

    public abstract int getCaramelos();

    public abstract void recibirCaramelos(double porcion);

    public void intentarAsustarA(Adulto adulto) {
        recibirCaramelos(adulto.asustarse(this));
    }

    public class MasFuerteComparator implements Comparator<Asustador> {
        @Override
        public int compare(Asustador a1, Asustador a2) {
            return (int) (a1.capacidadDeSusto() - a2.capacidadDeSusto());
        }
    }
}
