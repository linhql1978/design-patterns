package visitor.useReflection.book;

import visitor.useReflection.visitor.Visitor;

public class OtherConcreteBook implements Book{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
