package composite;

public class Leaf implements Component{
    @Override
    public void execute() {
        System.out.println(this);
    }
}
