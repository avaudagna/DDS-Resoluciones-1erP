package punto2.pendiente;

import punto2.pendiente.calificacion.Calificacion;

import java.util.Optional;

public class PendienteBuilder {

    private Hospedaje hospedaje;
    private Usuario usuario;
    private String texto;
    private Optional<Integer> valor = Optional.empty();

    public void hospedaje(Hospedaje hospedaje) {
        this.hospedaje = hospedaje;
    }

    public void usuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void texto(String texto) {
        this.texto = texto;
    }

    public void valor(int valor) {
        this.valor = Optional.of(valor);
    }

    public Pendiente construir()  {
        return valor.map(valorPosta -> (Pendiente) Calificacion.builder()
               .hospedaje(hospedaje)
               .texto(texto)
               .usuario(usuario)
               .valor(valorPosta)
               .construir())
            .orElseGet(() -> new Pregunta(hospedaje, usuario, texto));
    }
}
