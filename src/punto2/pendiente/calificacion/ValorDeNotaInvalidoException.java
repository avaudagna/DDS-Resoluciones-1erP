package punto2.pendiente.calificacion;

public class ValorDeNotaInvalidoException extends Exception {
    private int valor;

    public ValorDeNotaInvalidoException(int valor) {
        this.valor = valor;
    }

    @Override
    public String getMessage() {
        return "Valor de nota " + valor + " invalido. Valores posibles: -2, -1, 0, 1, 2";
    }
}