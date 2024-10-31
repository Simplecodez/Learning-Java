package generics;

public class Admin extends User {
    public Admin(String name, int rank){
        super(name, rank);
        this.role = "Admin";
    }
}
