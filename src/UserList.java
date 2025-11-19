import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> u = new ArrayList<User>();

    public void add(User user)
    {
        if(user == null) return;
        this.u.add(user);
    }

    public ArrayList<User> getu()
    {
        return u;
    }
}
