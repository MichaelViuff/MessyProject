import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class UserList
{
    private final List<User> users = new ArrayList<>();

    public void add(User user)
    {
        users.add(Objects.requireNonNull(user, "user"));
    }

    public User findByName(String name)
    {
        for (User user : users)
        {
            if (user.getName().equals(name))
            {
                return user;
            }
        }
        return null;
    }

    public List<User> getUsers()
    {
        return Collections.unmodifiableList(users);
    }
}
