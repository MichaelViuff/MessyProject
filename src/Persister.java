import java.io.*;
import java.util.*;

public class Persister
{
    public static void saveUsers(ArrayList<User> users) throws IOException
    {
        File file = new File("users.txt"); // Creates file
        FileWriter fileWriter = new FileWriter(file); // Create filewriter
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // Create BufferedWriter
        for(int index=0;index<users.size();index++) // Create a loop
        { // Nicely formatted block
            bufferedWriter.write(users.get(index).name); // Write first thing
            bufferedWriter.write(users.get(index).getId()); // Write second thing
        } // Ending parenthesis
    }
}
