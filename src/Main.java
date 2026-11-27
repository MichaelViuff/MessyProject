import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main
{
    private static final String DEFAULT_OUTPUT_PATH = "users.txt";

    public static void main(String[] args)
    {
        User user1 = new User(10, "Bob");
        User user2 = new User(20, "Alice");
        User user3 = new User(30, "Carl");

        UserList userList = new UserList();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        User bob = userList.findByName("Bob");
        if (bob != null)
        {
            System.out.println(bob.getName());
        }

        Path outputPath = Paths.get(DEFAULT_OUTPUT_PATH);
        try
        {
            Persister.saveUsers(userList.getUsers(), outputPath);
        }
        catch (IOException exception)
        {
            System.err.println("Could not save users to " + outputPath + ": " + exception.getMessage());
            System.exit(1);
        }
    }
}
