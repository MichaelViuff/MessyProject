import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException, IOException {
        User u1 = new User("Bob", 10);
        User u2 = new User("Alice",  20);
        User u3 = new User("Carl", 30);

        UserList list = new UserList();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(list.getUsers().get(0).getName());


        Persister.s(list.getUsers());
    }
}