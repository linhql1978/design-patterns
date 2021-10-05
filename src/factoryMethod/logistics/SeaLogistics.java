package factoryMethod.logistics;

import factoryMethod.transport.Ship;
import factoryMethod.transport.Transport;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
