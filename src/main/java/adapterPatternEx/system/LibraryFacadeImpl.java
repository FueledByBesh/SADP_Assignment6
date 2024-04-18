package adapterPatternEx.system;

import java.util.List;

public class LibraryFacadeImpl implements LibraryFacade{

    private final BookInventory bookInventory = new BookInventory();
    private final UserManagement userManagement = new UserManagement();

    @Override
    public void borrowBook() {

    }

    @Override
    public void returnBook() {

    }

    @Override
    public List<Book> searchBookByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> searchBookByAuthor(Author author) {
        return null;
    }
}
