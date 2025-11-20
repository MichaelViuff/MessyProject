import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> u = new ArrayList<User>();

    public void add(User u)
    {
        if (u == null) return;
        this.u.add(u);

        {
            return;
        }
    }

    public User getu(User target) {
        for (User x : u) {
            if (x.equals(target)) {
                return x;
            }
        }
        return null; // hvis ikke fundet
    }

