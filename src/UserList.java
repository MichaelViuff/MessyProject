import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> u = new ArrayList<User>();

    public void add(User u)
    {
        if(u == null)
        {
            throw new IllegalArgumentException("User must not be null");
        }
        this.u.add(u);
    }

    public ArrayList<User> getu()
    {
        return u;
    }
}
