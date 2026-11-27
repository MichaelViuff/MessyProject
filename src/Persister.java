import java.io.*;
import java.util.*;

public class Persister
{
    private static final String USERS_FILE_NAME = "users.txt";

    public static void s(ArrayList<User> u)
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(USERS_FILE_NAME)))
        {
            for(int x=0;x<u.size();x++) // Create a loop
            { // Nicely formatted block
                bw.write(u.get(x).c_nam); // Write first thing
                bw.write(";");
                bw.write(String.valueOf(u.get(x).geti())); // Write second thing
                bw.newLine();
            } // Ending parenthesis
        }
        catch (IOException e)
        {
            System.err.println("Could not save users to " + USERS_FILE_NAME + ": " + e.getMessage());
        }
    }
}
