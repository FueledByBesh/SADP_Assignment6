package facadePatternEx.system;


import lombok.Getter;

@Getter
public class User {

    private int id;
    private String firstName;
    private String lastName;

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
