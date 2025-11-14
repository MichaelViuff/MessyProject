import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> users = new ArrayList<User>();

    public void addUser(User user)
    {
        users.add(user);
    }

// Intended functionality unclear
    public User getUserByIndex(int index)
    {
      if (index < users.size()) return users.get(index);
      else {
        return null;
      }
    }
}
