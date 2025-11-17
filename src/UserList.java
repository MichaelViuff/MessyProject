import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> u = new ArrayList<User>();

    public void add(User username)
    {
        if(username == null)
        {
            return;
        }
        u.add(username);
    }

    public ArrayList<User> getu()
    {
        return u;
    }
}
