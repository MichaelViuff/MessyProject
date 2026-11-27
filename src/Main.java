import java.io.IOException;

public class Main
{
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
            System.out.println(bob.getn());
        }

        try
        {
            Persister.s(userList.getu());
        }
        catch (IOException exception)
        {
            System.err.println("Could not save users to users.txt: "
                    + exception.getMessage());
            System.exit(1);
        }
    }
}