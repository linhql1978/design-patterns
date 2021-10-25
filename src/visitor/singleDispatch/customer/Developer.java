package visitor.singleDispatch.customer;

import visitor.singleDispatch.book.Book;

public class Developer extends Customer {
    @Override
    public void buy(Book book) {
        System.out.println("Buy book: " + book);
    }
}
