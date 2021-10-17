package mediator;

public class MediumComponent extends Component{
    public MediumComponent(Mediator mediator, LevelCommunicate levelCommunicate) {
        super(mediator, levelCommunicate);
    }

    @Override
    public void requestCommunicate() {
        this.mediator.communicate(this);
    }

    @Override
    public void acceptCommunicate() {
        System.out.println("MediumComponent accept communicate");
    }
}
