package punto2.pendiente;

import punto2.pendiente.calificacion.Calificacion;
import punto2.pendiente.Pendiente;

import java.util.List;

public class Hospedaje {
    List<Calificacion> calificaciones;
    List<Pregunta> preguntas;

    public Hospedaje(List<Calificacion> calificaciones,
                     List<Pregunta> preguntas) {
        this.calificaciones = calificaciones;
        this.preguntas = preguntas;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public int suma() {
        return calificaciones.stream()
                .mapToInt(Calificacion::getValor)
                .sum();
    }
}
