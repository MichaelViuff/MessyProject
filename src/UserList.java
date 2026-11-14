import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> u = new ArrayList<User>();

    public void add(User u)
    {
        if (u == null)
        {
            return;
        }

        this.u.add(u);
    }

    public User getu(User searched) {
        if (searched == null) {
            return null;
        }

        for (User user : u) {
            if (user.equals(searched)) {
                return user;
            }
        }
        return null;
    }

    public ArrayList<User> getu()
    {
        return u;
    }
}
