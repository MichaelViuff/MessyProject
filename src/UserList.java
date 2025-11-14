import java.util.ArrayList;

public class UserList
{
  public ArrayList<User> users = new ArrayList<User>();

  public void addUser(User user)
  {
    users.add(user);
  }

  public ArrayList<User> getUsers()
  {
    return users;
  }
}
