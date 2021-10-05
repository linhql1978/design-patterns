package factoryMethod;

import factoryMethod.logistics.Logistics;
import factoryMethod.logistics.SkyLogistics;
import factoryMethod.transport.Transport;

public class AppClient {
    public static void main(String[] args) {
        Logistics logistics = new SkyLogistics();
        Transport transport = logistics.createTransport();

        logistics.planDelivery(transport);
    }
}