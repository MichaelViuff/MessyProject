import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserList list = new UserList();
        for (User user : List.of(
                new User(10, "Bob"),
                new User(20, "Alice"),
                new User(30, "Carl"))) {
            list.add(user);
        }

        System.out.println(list.getu());

        try {
            Persister.s(list.getu());
        } catch (IOException e) {
            System.err.println("Could not save users: " + e.getMessage());
        }
    }
}
