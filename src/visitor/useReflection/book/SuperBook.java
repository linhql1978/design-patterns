package visitor.useReflection.book;

import visitor.useReflection.visitor.Visitor;

public class SuperBook implements OtherBookInterface{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
