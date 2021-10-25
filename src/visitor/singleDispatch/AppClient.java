package visitor.singleDispatch;

import visitor.singleDispatch.book.Book;
import visitor.singleDispatch.book.ProgramingBook;
import visitor.singleDispatch.customer.Customer;
import visitor.singleDispatch.customer.Developer;
import visitor.singleDispatch.customer.OtherDeveloper;

public class AppClient {
    public static void main(String[] args) {
        Customer customer = new Developer();
        Customer otherCustomer = new OtherDeveloper();
        Book programingBook = new ProgramingBook();
        ProgramingBook otherProgramingBook = new ProgramingBook();

        customer.buy(programingBook);
        customer.buy(otherProgramingBook);

        otherCustomer.buy(programingBook);
        otherCustomer.buy(otherProgramingBook);
    }
}
