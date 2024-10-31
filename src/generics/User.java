package generics;

public class User implements Comparable<User> {
    private final String name;
    private int rank;
    protected String role = null;

    public User(String name, int rank){
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(User other) {
        return this.rank - other.rank;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
