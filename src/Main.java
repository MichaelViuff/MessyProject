import java.io.IOException;

public class Main
{
  public static void main(String[] args)
  {
      User user1 = new User("Bob", 10);
      User user2 = new User("Alice", 20);
      User user3 = new User("Carl", 30);

    UserList list = new UserList();
      list.add(user1);
      list.add(user2);
      list.add(user3);

    System.out.println(list.getUsers());

    try
    {
        Persister.writeToFile(list.getUsers());
    }

    catch (IOException e)
    {
      throw new RuntimeException(e);
    }
  }
}
