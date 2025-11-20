import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        User u1 = new User("Bob", 10);
        User u2 = new User("Alice", 20);
        User u3 = new User("Carl", 30);

        UserList list = new UserList();
        list.addUser(u1);
        list.addUser(u2);
        list.addUser(u3);

        System.out.println(list.getUsers());

      try {
        Persister.persistUsers(list.getUsers());
      } catch (IOException e) {
        e.printStackTrace();
      }

    }
}
