import java.util.ArrayList;

public class UserList
{
  public ArrayList<User> users = new ArrayList<User>();

  public void add(User user)
  {
    this.users.add(user);
    if (user == null)
    {
      return;
    }
  }

  public ArrayList<User> getu()
  {
    return users;
  }
}
