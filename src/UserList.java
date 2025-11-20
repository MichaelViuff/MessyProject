import java.util.ArrayList;

public class UserList
{
    private ArrayList<User> users = new ArrayList<User>();

    public void addUser(User user)
    {
        if(user != null)
        {
          this.users.add(user);
        }
    }



  public ArrayList<User> getUsers()
    {
        return this.users;
    }
}
