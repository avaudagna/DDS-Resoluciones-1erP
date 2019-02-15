package punto1.venta_de_entradas.reservar.enviar_ticket.adapters.guestern_iunion;

import punto1.venta_de_entradas.reservar.enviar_ticket.Resultado;
import punto1.venta_de_entradas.reservar.enviar_ticket.servicios_externos.guestern_iunion.ResultadoOperacion;

public class GuesternIunionResultadoOperacionDecorado extends ResultadoOperacion {
    private Resultado resultado;
    public GuesternIunionResultadoOperacionDecorado(Resultado resultado) {
        this.resultado = resultado;
    }
    public boolean isEstaOk() {
        return super.isEstaOk();
    }

    @Override
    public void setEstaOk(boolean estaOk) {
        super.setEstaOk(estaOk);
        if (estaOk) {
            resultado.exito();
        } else {
            resultado.error();
        }
    }
}
