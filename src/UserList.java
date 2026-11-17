import java.util.ArrayList;

public class UserList {
    public ArrayList<User> users = new ArrayList<User>();

    public void add(User u) {
        if (u == null) {
            return;
        }
        this.users.add(u);
    }

    public ArrayList<User> getu() {
        return users;
    }
}
