import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        User u1 = new User(10,"Bob");
        User u2 = new User(20,"Alice");
        User u3 = new User(30, "Carl");

        ArrayList<User> userList = new ArrayList<>();
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);

        Persister.saveData(userList);
    }
}
