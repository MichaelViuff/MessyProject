import java.util.ArrayList;

public class UserList {
    public ArrayList<User> users = new ArrayList<User>();

    public void add(User u) {
        this.users.add(u);
        if (u == null) {
            return;
        }
    }

    public ArrayList<User> getu() {
        return users;
    }
}
