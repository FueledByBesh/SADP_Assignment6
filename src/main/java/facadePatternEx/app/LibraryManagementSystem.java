package facadePatternEx.app;

import facadePatternEx.system.Book;
import facadePatternEx.system.Library;
import facadePatternEx.system.User;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();

        Book[] books = new Book[]{
                new Book(1,"To Kill a Mockingbird","Harper Lee"),
                new Book(2,"1984","George Orwell"),
                new Book(3,"Pride and Prejudice","Jane Austen"),
                new Book(4,"The Great Gatsby","F. Scott Fitzgerald"),
                new Book(5,"Harry Potter and the Sorcerer's Stone","J.K. Rowling")
        };

        User[] users = new User[]{
                new User(1,"Olzhas","Akimbay"),
                new User(2,"Arman","Akhylbekov"),
                new User(3,"Batyrkhan","Syrym")
        };


        // adding Books
        for (Book book: books)
            library.addBook(book);

        // adding Users
        for (User user: users)
            library.addUser(user);


        library.borrowBook(users[0],books[0]);

    }

}
