package punto2;

import punto2.pendiente.Hospedaje;
import punto2.pendiente.Pendiente;
import punto2.pendiente.Pregunta;
import punto2.pendiente.Usuario;
import punto2.pendiente.calificacion.ValorDeNotaInvalidoException;

import java.util.ArrayList;
import java.util.List;

public class Administrador {

    List<Pendiente> pendientes = new ArrayList<>();


    public void hacerPreguntaA(Hospedaje hospedaje, Usuario usuario, String texto){
        pendientes.add(new Pregunta(hospedaje, usuario, texto));
    }

    public void calificar(Hospedaje hospedaje, Usuario usuario,
                          String texto, int valor) throws NoSeInformaTextoException,
                                                          ValorDeNotaInvalidoException {
        pendientes.add(CalificacionFactory.getCalificacion(hospedaje, usuario, texto, valor));
    }

    public void aprobar(Pendiente pendiente){
        pendiente.aprobar();
        pendientes.remove(pendiente);
    }

    public void  rechazar(Pendiente pendiente){
        pendiente.getUsuario().registrarComentarioRechazado();
        pendientes.remove(pendiente);
    }
}
