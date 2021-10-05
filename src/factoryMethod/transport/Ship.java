package factoryMethod.transport;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("delivery by Ship");
    }
}
