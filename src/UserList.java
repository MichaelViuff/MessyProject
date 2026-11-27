import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> u = new ArrayList<User>();

    public void add(User u)
    {
        this.u.add(u);
        if(u == null)
        {
            return;
        }
    }
    public User findByName(String name)
    {
        for (User user : u)
        {
            if (java.util.Objects.equals(user.getn(), name))
            {
                return user;
            }
        }
        return null;
    }
    public ArrayList<User> getu()
    {
        return u;
    }
}
