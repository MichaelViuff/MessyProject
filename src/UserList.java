import java.util.ArrayList;

public class UserList
{
    private final ArrayList<User> u = new ArrayList<>();

    public void add(User user)
    {
        u.add(user);
    }

    public ArrayList<User> getUsers()
    {
        return u;
    }
}