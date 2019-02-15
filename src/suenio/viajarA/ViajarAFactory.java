package suenio.viajarA;

import suenio.viajarA.lugar.LugarFactory;

public class ViajarAFactory {

    public static ViajarA getViajeARio() {
        return new ViajarA(LugarFactory.getRioDeJaneiro());
    }
}
