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

    public ArrayList<User> getUsers()
    {
        return u;
    }
}
