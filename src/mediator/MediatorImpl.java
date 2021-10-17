package mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator{

    private List<Component> components;

    @Override
    public void addComponent(Component component){
        if(components==null){
            components = new ArrayList<>();
        }

        components.add(component);
    }

    @Override
    public void communicate(Component component) {
        for (Component otherComponent : this.components) {
            if (!otherComponent.equals(component) && otherComponent.getLevelCommunicate().getLevel() >= component.getLevelCommunicate().getLevel()) {
                otherComponent.acceptCommunicate();
            }
        }
    }
}
