package suenio.viajarA.lugar;


/**
 *  viajar a un lugar te da 21 felicidonios si el lugar es alguno
 *  de éstos: Bahía Bustamante, Moorea, Tahití o Macedonia. En caso contrario da 12
 */
public class LugarFactory {
    private static int PUNTOS_DEFAULT = 12;
    private static int PUNTOS_PREMIUM = 21;

    public static Lugar getBahiaBustamante() {
        return new Lugar("Bahia Bustamante", PUNTOS_PREMIUM);
    }

    public static Lugar getMoorea() {
        return new Lugar("Moorea", PUNTOS_PREMIUM);
    }

    public static Lugar getTahiti() {
        return new Lugar("Tahiti", PUNTOS_PREMIUM);
    }

    public static Lugar getLugar(String nombre) {
        return new Lugar(nombre, PUNTOS_DEFAULT);
    }

    public static Lugar getRioDeJaneiro() {
        return new Lugar("Rio de Janeiro", PUNTOS_DEFAULT);
    }
}
