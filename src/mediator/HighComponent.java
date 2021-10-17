package mediator;

public class HighComponent extends Component{
    public HighComponent(Mediator mediator, LevelCommunicate levelCommunicate) {
        super(mediator, levelCommunicate);
    }

    @Override
    public void requestCommunicate() {
        this.mediator.communicate(this);
    }

    @Override
    public void acceptCommunicate() {
        System.out.println("HighComponent accept communicate");
    }
}
