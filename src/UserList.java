import java.util.ArrayList;

public class UserList
{
  private ArrayList<User> users = new ArrayList<>();

  public void add(User user)
  {
    if (user == null)
    {
      return;
    }

    users.add(user);
  }

  public ArrayList<User> getUsers()
  {
    return new ArrayList<>(users);
  }

  public User getUser(User searchUser) {
    if (searchUser == null) {
      return null;
    }

    for (User user : users) {
      if (user.equals(searchUser)) {
        return user;
      }
    }

    return null;
  }
}

