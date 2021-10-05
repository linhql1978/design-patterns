package factoryMethod.logistics;

import factoryMethod.transport.Plane;
import factoryMethod.transport.Transport;

public class SkyLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
