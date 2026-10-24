import java.util.ArrayList;

public class UserList
{
    private final ArrayList<User> users = new ArrayList<>();

    public void add(User user)
    {
        this.users.add(user);
        if(user == null)
        {
            return;
        }

        users.add(user);
    }

    public ArrayList<User> getu()
    {
        return new ArrayList<>(users);
    }
}
