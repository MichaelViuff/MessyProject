import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User u1 = new User(10, "Bob");
        User u2 = new User(20, "Alice");
        User u3 = new User(30, "Carl");

        ArrayList<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);

        Persister.saveUsers(list);
    }
}
