package punto2.pendiente.calificacion;

import punto2.pendiente.Hospedaje;
import punto2.pendiente.Usuario;

public class CalificacionBuilder {
    private Hospedaje hospedaje;
    private Usuario usuario;
    private String texto;
    private int valor;
    CalificacionBuilder(){}
    public Calificacion construir() {
        validarTextoContraValor(valor,texto);
        return new Calificacion(hospedaje, usuario, texto, valor);
    }
    public void validarTextoContraValor(int valor, String texto) {
        if(estaDesaprobada(valor) && textoVacio(texto)) {
            throw new CalificationBuilderException("Las calificaciones desaprobadas deben tener texto");
        }
    }
    private boolean textoVacio(String texto) {
        return texto == null || texto.isEmpty();
    }
    private boolean estaDesaprobada(int valor) {
        return valor < 0;
    }
    public CalificacionBuilder hospedaje(Hospedaje hospedaje) {
        this.hospedaje = hospedaje;
        return this;
    }
    public CalificacionBuilder usuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }
    public CalificacionBuilder texto(String texto) {
        this.texto = texto;
        return this;
    }
    public CalificacionBuilder valor(int valor) {
        this.valor = valor;
        return this;
    }
    public class CalificationBuilderException extends RuntimeException {
        public CalificationBuilderException(String message) {
            super(message);
        }
    }
}
