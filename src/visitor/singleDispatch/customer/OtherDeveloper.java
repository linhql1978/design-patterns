package visitor.singleDispatch.customer;

import visitor.singleDispatch.book.Book;
import visitor.singleDispatch.book.BusinessBook;
import visitor.singleDispatch.book.ProgramingBook;

public class OtherDeveloper extends Customer {
    @Override
    public void buy(Book book) {
        if (book instanceof ProgramingBook)
            this.buy((ProgramingBook) book);
        else if (book instanceof BusinessBook)
            this.buy((BusinessBook) book);
    }
}
