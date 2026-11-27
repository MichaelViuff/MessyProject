import java.io.*;
import java.util.*;

public class Persister
{
    private static final String USERS_FILE_NAME = "users.txt";

    public static void saveUsers(List<User> users)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USERS_FILE_NAME)))
        {
            for (User user : users)
            {
                writer.write(user.getName());
                writer.write(";");
                writer.write(String.valueOf(user.getId()));
                writer.newLine();
            }
        }
        catch (IOException e)
        {
            System.err.println("Could not save users to " + USERS_FILE_NAME + ": " + e.getMessage());
        }
    }
}
