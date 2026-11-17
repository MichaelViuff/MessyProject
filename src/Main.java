import java.io.IOException;
import java.util.List;

public class Main {
    private static final String DEFAULT_OUTPUT_FILE = "users.txt";

    public static void main(String[] args) {
        UserList list = new UserList();
        for (User user : List.of(
                new User(10, "Bob"),
                new User(20, "Alice"),
                new User(30, "Carl"))) {
            list.add(user);
        }

        System.out.println(list.getu());

        String outputFile = args.length == 0 ? DEFAULT_OUTPUT_FILE : args[0];
        try {
            Persister.s(list.getu(), outputFile);
        } catch (IOException e) {
            System.err.println("Could not save users: " + e.getMessage());
        }
    }
}
