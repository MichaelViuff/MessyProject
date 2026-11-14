
import java.util.ArrayList;

public class UserList
{
    private ArrayList<User> users = new ArrayList<>();

    public void add(User user)
    {
        if (user == null)
        {
            return;
        }

        users.add(user);
    }

    public ArrayList<User> getUsers()
    {
        return users;
    }

    public User findUser(User searched)
    {
        if (searched == null)
        {
            return null;
        }

        for (User user : users)
        {
            if (user.equals(searched))
            {
                return user;
            }
        }

        return null;
    }
}
