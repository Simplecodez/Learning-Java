package Collections;

import generics.Admin;
import generics.Author;
import generics.NameComparator;
import generics.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {
    public static void show(){
        List<User> users = new ArrayList<>();
        users.add(new Author("Emmaneuel", 3));
        users.add(new Admin("jane", 4 ));

        users.sort(new NameComparator());
        System.out.println(users);

    }
}
