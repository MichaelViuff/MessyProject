public class Main
{
    public static void main(String[] args)
    {
        User u1 = new User(1,"Bob");
        User u2 = new User(2,"Alice");
        User u3 = new User(3,"Carl");

        UserList list = new UserList();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(list.getUsers());

        Persister.saveToFile(list);
    }
}