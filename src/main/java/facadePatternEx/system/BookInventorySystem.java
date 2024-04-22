package facadePatternEx.system;

import java.util.*;

public class BookInventorySystem {

    private static BookInventorySystem instance;

    private final Set<Book> books = new HashSet<>();
    private final Map<Book,List<User>> borrowedHistory = new HashMap<>();
    private final Set<Book> borrowed = new HashSet<>();


    private BookInventorySystem(){}

    public static BookInventorySystem getInstance() {
        if(instance==null)
            instance = new BookInventorySystem();
        return instance;
    }

    public List<Book> getBookList(){
        return books.stream().toList();
    }

    public boolean add(Book book){
        if(books.contains(book))
            return false;
        this.books.add(book);
        return true;
    }

    public boolean remove(Book book){
        if(!books.contains(book))
            return false;
        this.books.remove(book);
        return true;
    }

    public boolean borrow(Book book,User user){

        if(!books.contains(book))
            return false;

        if(borrowed.contains(book))
            return false;

        if(borrowedHistory.containsKey(book)){
            borrowedHistory.get(book).add(user);
            return true;
        }
        List<User> borrowers = new ArrayList<>();
        borrowers.add(user);
        borrowedHistory.put(book,borrowers);
        return true;

    }

    public boolean returnBack(Book book){
        if(!borrowed.contains(book))
            return false;

        borrowed.remove(book);
        return true;
    }

    public String about(Book book){
        return "Book Id: "+book.getId()+"\n"+
                "Book Title: "+book.getTitle()+"\n"+
                "Book Author: "+book.getAuthor()+"\n"+
                "Book Status: "+((borrowed.contains(book))?"Not ":"")+"Available"+"\n";
    }


}
