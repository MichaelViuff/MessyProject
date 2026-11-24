public class Main {
    public static void main(String[] args) {
        UserList userList = new UserList();
        userList.add(new User(10, "Bob"));
        userList.add(new User(20, "Alice"));
        userList.add(new User(30, "Carl"));

        System.out.println(userList.getUsers());

        try {
            Persister.saveUsers(userList.getUsers(), "users.txt");
        } catch (java.io.IOException e) {
            System.err.println("Kunne ikke gemme brugerlisten: " + e.getMessage());
        }
    }
}
