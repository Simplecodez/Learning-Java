package generics;

public class Author extends User{
    public Author(String name, int rank) {
        super(name, rank);
        this.role = "Author";
    }
}
