public class Main
{
    public static void main(String[] args)
    {
        User user1 = new User(10, "Bob");
        User user2 = new User(20, "Alice");
        User user3 = new User(30, "Carl");

        UserList list = new UserList();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        System.out.println(list.getu(new User(11, "Bob"));

        Persister.s(list);
    }
}
