package composite;

import java.util.Arrays;

public class AppClient {
    public static void main(String[] args) {
        Component component = new Composite(Arrays.asList(new Leaf(), new Composite(Arrays.asList(new Leaf(),
                new Composite(Arrays.asList(new Leaf(), new Leaf())))), new Leaf()));

        component.execute();
    }
}
