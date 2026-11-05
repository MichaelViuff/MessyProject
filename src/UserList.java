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

    public ArrayList<User> getUsers()
    {
        return u;
    }
    public User findUser(User user)
    {
        if (user == null)
        {
            return null;
        }

        for (User currentUser : u)
        {
            if (currentUser.equals(user))
            {
                return currentUser;
            }
        }

        return null;
    }
}
