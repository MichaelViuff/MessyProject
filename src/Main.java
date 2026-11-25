public class Main
{
    public static void main(String[] args)
    {
        User u1 = new User(10, "Bob");
        User u2 = new User(20, "Alice");
        User u3 = new User(30, "Carl");

        UserList list = new UserList();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(list.getu(new User(11, "Bob")));

        Persister.s(list);
    }
}
