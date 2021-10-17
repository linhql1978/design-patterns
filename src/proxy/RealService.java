package proxy;

public class RealService implements ServiceInterface{
    @Override
    public void operation() {
        System.out.println("RealService's operation");
    }
}
