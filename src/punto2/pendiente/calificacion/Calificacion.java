package punto2.pendiente.calificacion;

import punto2.pendiente.Hospedaje;
import punto2.pendiente.Pendiente;
import punto2.pendiente.Usuario;

public class Calificacion extends Pendiente {
    private int valor;
    public static CalificacionBuilder builder() {
        return new CalificacionBuilder();
    }
    Calificacion(Hospedaje hospedaje, Usuario usuario,
                        String texto, int valor)  {
        super(hospedaje, usuario, texto);
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }

    public void getCalificacion(Hospedaje hospedaje, Usuario usuario, String text, int valor) {
    }

    @Override
    public void aprobar() {
        getHospedaje().getCalificaciones().add(this);
    }
}
