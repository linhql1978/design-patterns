package factoryMethod.logistics;

import factoryMethod.transport.Transport;

public abstract class Logistics {
    public void planDelivery(Transport transport){
        transport.deliver();
    }

    public abstract Transport createTransport();
}
