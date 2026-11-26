import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        User bob = new User("Bob", 10);
        User alice = new User("Alice", 20);
        User carl = new User("Carl", 30);

        UserList userList = new UserList();
        userList.add(bob);
        userList.add(alice);
        userList.add(carl);

        System.out.println(userList.getUser(new User("Bob", 11)));

        String fileName = args.length > 0 ? args[0] : Persister.DEFAULT_FILE_NAME;
        try
        {
            Persister.saveUsers(userList, fileName);
        }
        catch (IOException e)
        {
            System.out.println("Could not save users: " + e.getMessage());
        }
    }
}
