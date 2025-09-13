package Iterator_Design_Pattern;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book(500,"Head First Design Patterns"),
                new Book(600,"DSA in C++"),
                new Book(700,"Let us C"),
                new Book(300,"Modern Machine Learning")
        );

        Library lib = new Library(bookList);
        Iterator iter = lib.createIterator();

        while(iter.hasNext()){
            Book book = (Book) iter.next();
            System.out.println(book.getBookName() + " : " + book.getPrice() + "$");
        }
    }
}
