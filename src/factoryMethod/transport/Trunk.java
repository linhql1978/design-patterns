package factoryMethod.transport;

public class Trunk implements Transport{
    @Override
    public void deliver() {
        System.out.println("delivery by Trunk");
    }
}
