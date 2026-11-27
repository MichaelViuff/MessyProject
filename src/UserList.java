import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> user = new ArrayList<User>();

    public void add(User user)
    {
        if(user == null)
        {
            return;
        }
        this.user.add(user);
    }

    public ArrayList<User> getUser(User bob)
    {
        return user;
    }

    public User get(int x) {
        return user.get(x);
    }

    public int size() {
        return user.size();
    }
}
