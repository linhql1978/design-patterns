package factoryMethod.transport;

public class Plane implements Transport{
    @Override
    public void deliver() {
        System.out.println("delivery by Plane");
    }
}
