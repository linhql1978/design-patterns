package adapter.adaptee;

public class OtherAdapteeImpl implements OtherAdaptee{
    @Override
    public void specificRequest() {
        System.out.println("Other Adaptee Impl");
    }
}
