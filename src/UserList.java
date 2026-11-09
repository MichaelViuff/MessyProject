import java.util.ArrayList;

public class UserList
{
  public ArrayList<User> user = new ArrayList<>();

  public void add(User user)
  {
    this.user.add(user);
  }

  public ArrayList<User> getUser()
  {
    return user;
  }
}
