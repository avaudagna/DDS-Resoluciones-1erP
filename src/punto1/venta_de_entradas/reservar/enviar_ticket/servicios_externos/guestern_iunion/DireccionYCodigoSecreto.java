package punto1.venta_de_entradas.reservar.enviar_ticket.servicios_externos.guestern_iunion;

public class DireccionYCodigoSecreto {

    private String calle;
    private int numero;
    private int cp;
    private String ciudad;
    private String provincia;
    private String codigoSecreto;

    public DireccionYCodigoSecreto(String calle, int numero, int cp,
                                   String ciudad, String provincia,
                                   String codigoSecreto) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoSecreto = codigoSecreto;

    }
}
