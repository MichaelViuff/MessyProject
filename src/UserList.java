import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserList
{
    private final ArrayList<User> users = new ArrayList<>();

    public void add(User user)
    {
        if (user == null)
        {
            throw new IllegalArgumentException("User must not be null");
        }
        users.add(user);
    }

    public List<User> getUsers()
    {
        return Collections.unmodifiableList(users);
    }
}
