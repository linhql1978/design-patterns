package visitor.useReflection.visitor;

import visitor.useReflection.book.OtherConcreteBook;

public class OtherConcreteVisitor extends Visitor {

    public void visit(OtherConcreteBook otherConcreteBook) {
        System.out.println("OtherConcreteVisitor visit: " + otherConcreteBook);
    }
}
