import java.io.*;
import java.util.*;

public class Persister
{
    public static void writeToFile(ArrayList<User> users) throws IOException
    {
        File file = new File("users.txt"); // Creates file
        FileWriter fileWriter = new FileWriter(file); // Create filewriter
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // Create BufferedWriter
        for(int i=0;i<users.size()-1;i++) // Create a loop
        { // Nicely formatted block
            bufferedWriter.write(users.get(i).name); // Write first thing
            bufferedWriter.write(users.get(i).getUserId()); // Write second thing
        } // Ending parenthesis
    }
}
