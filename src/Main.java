public class Main
{
    public static void main(String[] args)
    {
        User u1 = new User(10,"Bob");
        User u2 = new User(20,"Alice");
        User u3 = new User(30, "Carl");

        UserList userList = new UserList();
        userList.addUser(u1);
        userList.addUser(u2);
        userList.addUser(u3);

//      Intent unclear. Trying to getu(getUser?) but then creating a new User)
//      System.out.println(userList.getu(new User(11,"Bob")));

        Persister.saveData(userList);
    }
}
