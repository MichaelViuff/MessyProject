import java.util.ArrayList;

public class UserList {
    private final ArrayList<User> u = new ArrayList<>();

    // Add a user if the reference is not null
    public void add(User user) {
        if (user == null) {
            return;
        }

        u.add(user);
    }

    // Return the list of users
    public ArrayList<User> getu() {
        return u;
    }

    // Find a user using the equals method
    public User findUser(User user) {
        if (user == null) {
            return null;
        }

        for (User current : u) {
            if (current.equals(user)) {
                return current;
            }
        }

        return null;
    }
}