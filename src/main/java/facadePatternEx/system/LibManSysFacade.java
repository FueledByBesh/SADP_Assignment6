package facadePatternEx.system;

import java.util.List;



// interface of facade
public interface LibManSysFacade {

    void borrowBook(User user,Book book);
    void returnBook(User user,Book book);
    List<Book> searchBookByTitle(String title);
    List<Book> searchBookByAuthor(String author);

}
