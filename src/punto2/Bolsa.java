package punto2;

public class Bolsa {

    private int caramelos;
    private int capacidadMaxima;
    private int coeficienteDeSobrecarga;

    public Bolsa(int caramelos, int capacidadMaxima, int coeficienteDeSobrecarga) {
        this.caramelos = caramelos;
        this.capacidadMaxima = capacidadMaxima;
        this.coeficienteDeSobrecarga = coeficienteDeSobrecarga;
    }
    public void agregarCaramelos(int cantidadNueva) throws BolsaSobrepasadaException {
        validarCargaPosible(cantidadNueva);
        this.caramelos += cantidadNueva;
    }

    private void validarCargaPosible(int cantidadNueva) throws BolsaSobrepasadaException {
        if(caramelos + cantidadNueva > capacidadMaxima) {
            throw new BolsaSobrepasadaException(capacidadMaxima, capacidadMaxima - (caramelos + cantidadNueva));
        }
    }

    public void disminuirCaramelos(int cantidad) throws CaramelosInsuficientesException {
        validarCantidadSuficiente(cantidad);
        this.caramelos -= cantidad;
    }

    private void validarCantidadSuficiente(int cantidad) throws CaramelosInsuficientesException {
        if(caramelos < cantidad) {
            throw new CaramelosInsuficientesException(cantidad, caramelos);
        }
    }

    public double limiteCasiLlenaBolsa() {
        return 0.9 * capacidadMaxima * coeficienteDeSobrecarga;
    }


    public class CaramelosInsuficientesException extends Exception {
        private int cantidadDeseada;
        private int stock;
        public CaramelosInsuficientesException(int cantidadDeseada, int stock) {
            this.cantidadDeseada = cantidadDeseada;
            this.stock = stock;
        }
        @Override
        public String getMessage() {
            return "Se pretendieron quitar " + cantidadDeseada + " cuando hay " + stock + ".";
        }
    }

    public class BolsaSobrepasadaException extends Exception {
        private int capacidadMaxima;
        private int sobrepaso;
        public BolsaSobrepasadaException( int capacidadMaxima, int sobrepaso) {
            this.capacidadMaxima = capacidadMaxima;
            this.sobrepaso = sobrepaso;
        }
        @Override
        public String getMessage() {
            return "Se sobrepaso el limite de " + capacidadMaxima + " caramelos por " + sobrepaso + ".";
        }
    }
}
