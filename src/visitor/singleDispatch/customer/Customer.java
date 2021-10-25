package visitor.singleDispatch.customer;

import visitor.singleDispatch.book.Book;
import visitor.singleDispatch.book.BusinessBook;
import visitor.singleDispatch.book.ProgramingBook;

public abstract class Customer {
    public abstract void buy(Book book);

    public void buy(ProgramingBook book) {
        System.out.println("Buy ProgramingBook: " + book);
    }

    public void buy(BusinessBook book) {
        System.out.println("Buy BusinessBook: " + book);
    }
}
