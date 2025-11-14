import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        User bob = new User(1,"Bob");
        User alice = new User(2,"Alice");
        User carl = new User(3,"Carl");

        UserList list = new UserList();
        list.addUser(bob);
        list.addUser(alice);
        list.addUser(carl);

        System.out.println(list.getUsers());

      try
      {
        Persister.saveToFile(list.getUsers());
      }
      catch (IOException e)
      {
        System.out.println(e.getMessage());
      }
    }
}