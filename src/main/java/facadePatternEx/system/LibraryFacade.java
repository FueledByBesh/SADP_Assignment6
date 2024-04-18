package facadePatternEx.system;

import java.util.List;

public interface LibraryFacade {

    void borrowBook();
    void returnBook();
    List<Book> searchBookByTitle(String title);
    List<Book> searchBookByAuthor(Author author);

}
