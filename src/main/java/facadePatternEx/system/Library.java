package facadePatternEx.system;


import java.util.ArrayList;
import java.util.List;


// Facade
public class Library {

    private final BookInventorySystem bis = BookInventorySystem.getInstance();
    private final UserManagementSystem ums = UserManagementSystem.getInstance();

    public Library(){}

    public void borrowBook(User user,Book book) {
        bis.borrow(book,user);
        ums.borrow(book,user);
    }

    public void returnBook(Book book) {
        bis.returnBack(book);
    }

    public List<Book> searchBookByTitle(String title) {

        List<Book> booksByTitle = new ArrayList<>();

        for (Book book: bis.getBookList()) {
            if (title.equalsIgnoreCase(book.getTitle()))
                booksByTitle.add(book);
        }

        return (booksByTitle.size()==0)?null:booksByTitle;
    }

    public List<Book> searchBookByAuthor(String author) {

        List<Book> booksByAuthor = new ArrayList<>();

        for(Book book: bis.getBookList()){
            if(author.equalsIgnoreCase(book.getAuthor()))
                booksByAuthor.add(book);
        }

        return (booksByAuthor.size()==0)?null:booksByAuthor;
    }

    public boolean addBook(Book book){
        return bis.add(book);
    }

    public boolean removeBook(Book book){
        return bis.remove(book);
    }

    public boolean addUser(User user){
        return ums.add(user);
    }

    public boolean removeUser(User user){
        return ums.remove(user);
    }

    public List<User> getLibraryClients(){
        return ums.getUserList();
    }

    public String aboutUser(User user){
        return ums.about(user);
    }

    public String aboutBook(Book book){
        return bis.about(book);
    }

}
