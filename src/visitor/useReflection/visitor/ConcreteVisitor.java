package visitor.useReflection.visitor;

import visitor.useReflection.book.ConcreteBook;

public class ConcreteVisitor extends Visitor {

    public void visit(ConcreteBook concreteBook) {
        System.out.println("ConcreteVisitor visit: " + concreteBook);
    }
}
