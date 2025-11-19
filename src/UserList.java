import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> u = new ArrayList<>();

    public void add(User user)
    {
        this.u.add(user);
    }

    public ArrayList<User> getUserlist()
    {
        return u;
    }
}
