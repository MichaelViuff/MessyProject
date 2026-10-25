import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create three users
        User u1 = new User("Bob", 10);
        User u2 = new User("Alice", 20);
        User u3 = new User("Carl", 30);

        // Add users to the list
        UserList list = new UserList();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        // Find and print a user by name
        User found = list.findUser(new User("Bob", 11));

        if (found != null) {
            System.out.println(found.getn());
        } else {
            System.out.println("User not found");
        }

        // Save all users to a file
        Persister.s(list.getu());
    }
}