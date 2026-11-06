import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> users = new ArrayList<User>();

    public void add(User user)
    {
        if(user == null)
        {
            return;
        }
        this.users.add(user);
    }

    public ArrayList<User> getUsers()
    {
        return users;
    }
}
