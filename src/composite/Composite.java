package composite;

import java.util.List;

public class Composite implements Component{

    private List<Component> children;

    public Composite(List<Component> children) {
        this.children = children;
    }

    @Override
    public void execute() {
        children.forEach(Component::execute);
    }
}
