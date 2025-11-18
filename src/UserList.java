import java.util.ArrayList;

public class UserList {
    public ArrayList<User> users = new ArrayList<User>();

    public boolean addUser(User newUser) {
         return newUser == null ? false : users.add(newUser);
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
