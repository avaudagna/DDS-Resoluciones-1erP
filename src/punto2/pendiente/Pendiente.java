package punto2.pendiente;

public abstract class Pendiente implements Aprobable {

    private Hospedaje hospedaje;
    private Usuario usuario;
    private String texto;

    public Pendiente(Hospedaje hospedaje, Usuario usuario, String texto) {
        this.hospedaje = hospedaje;
        this.usuario = usuario;
        this.texto = texto;
    }

    public Hospedaje getHospedaje() {
        return hospedaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getTexto() {
        return texto;
    }
}
