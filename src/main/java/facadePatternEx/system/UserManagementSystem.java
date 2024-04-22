package facadePatternEx.system;


import java.util.*;

public class UserManagementSystem {

    private static UserManagementSystem instance;

    private final Set<User> users = new HashSet<>();

    private final Map<User,List<Book>> readedBooks = new HashMap<>();


    private UserManagementSystem(){}

    public static UserManagementSystem getInstance() {
        if (instance == null)
            instance = new UserManagementSystem();
        return instance;
    }

    public boolean borrow(Book book, User user){

        if(!users.contains(user))
            return false;

        if(readedBooks.containsKey(user)){
            readedBooks.get(user).add(book);
            return true;
        }

        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        readedBooks.put(user,bookList);
        return true;
    }


    public List<User> getUserList(){
        return users.stream().toList();
    }

    public boolean add(User user){
        if(users.contains(user))
            return  false;
        this.users.add(user);
        return true;
    }

    public boolean remove(User user){
        if(!users.contains(user))
            return  false;
        this.users.remove(user);
        return true;
    }



    public String about(User user){
        return "User Id: "+user.getId()+"\n"+
                "User Firstname: "+user.getFirstName()+"\n"+
                "User Lastname: "+user.getLastName()+"\n"+
                "Books Readed: "+readedBooks.get(user).size()+"\n";
    }

}
