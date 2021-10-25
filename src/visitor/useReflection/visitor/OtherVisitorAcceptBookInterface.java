package visitor.useReflection.visitor;

import visitor.useReflection.book.OtherBookInterface;

public class OtherVisitorAcceptBookInterface extends Visitor {
    public void visit(OtherBookInterface otherBookInterface) {
        System.out.println("OtherVisitorAcceptBookInterface visit: " + otherBookInterface);
    }
}
