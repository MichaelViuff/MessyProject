import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        User u1 = new User(10, "Bob");
        User u2 = new User(20, "Alice");
        User u3 = new User(30, "Carl");

        UserList list = new UserList();
        list.addUser(u1);
        list.addUser(u2);
        list.addUser(u3);

        for (User user : list.getUsers()) {
            System.out.println(user); // prints all the users
        }

        Persister.saveUsers(new ArrayList<>(list.getUsers()));
    }
}
