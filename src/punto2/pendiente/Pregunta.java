package punto2.pendiente;

public class Pregunta extends Pendiente {

    public Pregunta(Hospedaje hospedaje, Usuario usuario, String texto) {
        super(hospedaje, usuario, texto);
    }

    public void aprobar() {
        getHospedaje().getPreguntas().add(this);
    }

    @Override
    public boolean debeComentarse() {
        return false;
    }
}
