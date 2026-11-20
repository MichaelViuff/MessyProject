import java.util.ArrayList;
public class UserList {
    public ArrayList<User> u = new ArrayList<>();

    public void add(User user) {
        if (user == null) {
            return;
        }
        u.add(user);
    }

    public ArrayList<User> getUsers() {
        return u;
    }
}