package adapter;

import adapter.adaptee.OtherAdapteeImpl;
import adapter.target.OtherAdapter;
import adapter.target.Target;

public class AppClient {
    public static void main(String[] args) {
//        Target target = new Adapter(new AdapteeImpl());
        Target target = new OtherAdapter(new OtherAdapteeImpl());

        target.request();
    }
}
