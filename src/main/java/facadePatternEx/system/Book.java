package facadePatternEx.system;

import lombok.Getter;
import lombok.Setter;


@Getter
public class Book {

    private int id;
    @Setter
    private String title;
    @Setter
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

}
