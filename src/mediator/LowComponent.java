package mediator;

public class LowComponent extends Component{
    public LowComponent(Mediator mediator, LevelCommunicate levelCommunicate) {
        super(mediator, levelCommunicate);
    }

    @Override
    public void requestCommunicate() {
        this.mediator.communicate(this);
    }

    @Override
    public void acceptCommunicate() {
        System.out.println("LowComponent accept communicate");
    }
}
