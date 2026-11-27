import java.io.*;
import java.util.*;

public class Persister
{
    private static final String USERS_FILE_NAME = "users.txt";

    public static void saveUsers(List<User> users)
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(USERS_FILE_NAME)))
        {
            for(int x=0;x<users.size();x++) // Create a loop
            { // Nicely formatted block
                bw.write(users.get(x).getName()); // Write first thing
                bw.write(";");
                bw.write(String.valueOf(users.get(x).getId())); // Write second thing
                bw.newLine();
            } // Ending parenthesis
        }
        catch (IOException e)
        {
            System.err.println("Could not save users to " + USERS_FILE_NAME + ": " + e.getMessage());
        }
    }
}
