import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> u = new ArrayList<User>();

    public void add(User u)
    {
        if(u == null)
        {
            return;
        }
        this.u.add(u);
    }

    public ArrayList<User> getu()
    {
        return u;
    }

    public User getUser(User user)
    {
        for (User existingUser : u)
        {
            if (existingUser.equals(user))
            {
                return existingUser;
            }
        }
        return null;
    }
}
