
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        User u1 = new User(10, "Bob");
        User u2 = new User(20, "Alice");
        User u3 = new User(30, "Carl");

        UserList list = new UserList();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        User found = list.findUser(new User(11, "Bob"));

        if (found != null)
        {
            System.out.println(found.getName());
        }

        try
        {
            Persister.save(list.getUsers());
        }
        catch (IOException e)
        {
            System.err.println("Could not save users: " + e.getMessage());
        }
    }
}
