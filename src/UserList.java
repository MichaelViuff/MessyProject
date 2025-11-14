import java.util.ArrayList;

public class UserList
{
  public ArrayList<User> users;
  public UserList(){
    users = new ArrayList<>();
  }

  public void addUser(User user)
  {
    users.add(user);
  }

  public ArrayList<User> getUsers()
  {
    return users;
  }
}
