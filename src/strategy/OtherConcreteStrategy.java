package strategy;

public class OtherConcreteStrategy implements Strategy{
    @Override
    public void execute(String data) {
        System.out.println("OtherConcreteStrategy execute with data: "+data);
    }
}
