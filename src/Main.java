public class Main
{
    public static void main(String[] args)
    {
        User bob = new User(10, "Bob");
        User alice = new User(20, "Alice");
        User carl = new User(30, "Carl");

        UserList list = new UserList();
        list.add(bob);
        list.add(alice);
        list.add(carl);

        System.out.println(list.getUsers());

        try {
            Persister.saveUsers(list.getUsers());
        } catch (java.io.IOException e) {
            System.err.println("Kunne ikke gemme brugerne: " + e.getMessage());
        }
    }
}
