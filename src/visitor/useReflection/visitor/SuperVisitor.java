package visitor.useReflection.visitor;

import visitor.useReflection.book.SuperBook;

public class SuperVisitor extends Visitor {
    public void visit(SuperBook superBook) {
        System.out.println("SuperVisitor visit: "+superBook);
    }
}
