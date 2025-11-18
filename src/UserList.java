import java.util.ArrayList;

public class UserList {
    public ArrayList<User> user = new ArrayList<User>();

    public void addUser(User newUser) {
        this.user.add(newUser);
        if (newUser == null) {
            return;
        }
    }

    public ArrayList<User> getUser() {
        return user;
    }
}
