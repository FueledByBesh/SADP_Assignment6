package facadePatternEx.system;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book {

    private int id;

    @Getter @Setter
    private int quantity;
    @Getter@Setter
    private String title;
    @Getter@Setter
    private Author author;

    private Set<User> owners;

    public Book(int id, int quantity, String title, Author author) {
        this.id = id;
        this.quantity = quantity;
        this.title = title;
        this.author = author;
        this.owners = new HashSet<>();
    }

    public boolean setQuantity(int quantity) {
        if(quantity<1)
            return false;
        this.quantity+=quantity;
        return true;
    }

    public boolean getQuantity(int quantity) {
        if(quantity<1 && this.quantity<quantity)
            return false;
        this.quantity-=quantity;
        return true;
    }

    public boolean addOwner(User user){
        if(owners.contains(user))
            return false;
        owners.add(user);
        return true;
    }

    public boolean removeOwner(User user){
        if(owners.contains(user)){
            owners.remove(user);
            return true;
        }
        return false;
    }

    public List<User> getOwners(){
        return owners.stream().toList();
    }

    public String about() {
        return "Id: "+id+"\n"+
                "Quantity: "+quantity+"\n";
    }

}
