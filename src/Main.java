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

        System.out.println(list.findUser(new User(10, "Bob")));

        try
        {
          Persister.s(list.getUsers());
        }
        catch (IOException e)
        {
            System.err.println("Kunne ikke gemme brugerne: " + e.getMessage());
        }
    }
}
