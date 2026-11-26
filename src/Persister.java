import java.io.*;
import java.util.*;

public class Persister
{
    public static void saveUsers(UserList userList) throws IOException
    {
        ArrayList<User> users = userList.getUsers();
        File file = new File("users.txt"); // Creates file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            for(User user : users) // Create a loop
            { // Nicely formatted block
                writer.write(user.getName() + ";" + user.getId()); // Write first thing
                writer.newLine();
            } // Ending parenthesis
        }
    }
}
