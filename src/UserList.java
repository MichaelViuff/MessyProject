import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> users = new ArrayList<>();

    public void add(User user)
    {
        this.users.add(user);
    }

    public ArrayList<User> getUsers()
    {
        return users;
    }
}
