import java.util.ArrayList;

public class UserList
{
    private ArrayList<User> users = new ArrayList<User>();

    public void add(User user)
    {
        if(user == null)
        {
            return;
        }
        users.add(user);
    }

    public ArrayList<User> getUsers()
    {
        return users;
    }

    public User getUser(User user)
    {
        for (User existingUser : users)
        {
            if (existingUser.equals(user))
            {
                return existingUser;
            }
        }
        return null;
    }
}
