package facadePatternEx.system;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Users implements User {
    private int id;
    private String firstName;
    private String lastName;

    public Users(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}