package adapter.adaptee;

public class AdapteeImpl implements Adaptee{
    @Override
    public void specificRequest() {
        System.out.println("Adaptee implements");
    }
}
