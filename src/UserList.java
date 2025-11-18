import java.util.ArrayList;

public class UserList {
    public ArrayList<User> users = new ArrayList<User>();

    public void addUser(User newUser) {
        users.add(newUser);
        if (newUser == null) {
            return;
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
