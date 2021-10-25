package visitor.useReflection;

import visitor.useReflection.book.Book;
import visitor.useReflection.book.ConcreteBook;
import visitor.useReflection.book.OtherConcreteBook;
import visitor.useReflection.book.SuperBook;
import visitor.useReflection.visitor.*;

public class AppClient {
    public static void main(String[] args) {
        Visitor concreteVisitor = new ConcreteVisitor();
        Visitor otherConcreteVisitor = new OtherConcreteVisitor();
        Visitor superVisitor = new SuperVisitor();
        Visitor otherVisitorAcceptBookInterface = new OtherVisitorAcceptBookInterface();

        Book otherConcreteBook = new OtherConcreteBook();
        Book concreteBook = new ConcreteBook();
        Book superBook = new SuperBook();

//        superBook.accept(otherVisitorAcceptBookInterface);
        superBook.accept(concreteVisitor);
    }
}
