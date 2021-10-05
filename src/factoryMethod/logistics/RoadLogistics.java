package factoryMethod.logistics;

import factoryMethod.transport.Transport;
import factoryMethod.transport.Trunk;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Trunk();
    }
}
