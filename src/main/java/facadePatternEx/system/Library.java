package facadePatternEx.system;

import facadePatternEx.app.LibraryManagementSystem;

import java.util.List;



// Implementatin of Facade
public class Library implements LibManSysFacade{

    private final BookInventorySystem bis = new BookInventorySystem();
    private final UserManagementSystem ums = new UserManagementSystem();

    public Library(){}

    @Override
    public void borrowBook(User user,Book book) {

    }

    @Override
    public void returnBook(User user, Book book) {

    }

    @Override
    public List<Book> searchBookByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> searchBookByAuthor(String author) {
        return null;
    }

}
