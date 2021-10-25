package visitor.useReflection.book;

import visitor.useReflection.visitor.Visitor;

public interface Book {
    void accept(Visitor visitor);
}
