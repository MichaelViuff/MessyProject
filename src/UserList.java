import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> u = new ArrayList<>();

    public void add(User u)
    {
        this.u.add(u);
    }

    public ArrayList<User> getUsers()
    {
        return u;
    }
}
