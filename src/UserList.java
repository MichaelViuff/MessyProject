import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> users = new ArrayList<>();

    public void add(User user)
    {
        if (user == null) {
            throw new IllegalArgumentException("Brugeren må ikke være null.");
        }
        this.users.add(user);
    }

    public ArrayList<User> getUsers()
    {
        return users;
    }
}
