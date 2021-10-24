package strategy;

public class ConcreteStrategy implements Strategy{
    @Override
    public void execute(String data) {
        System.out.println("ConcreteStrategy execute with data: "+data);
    }
}
