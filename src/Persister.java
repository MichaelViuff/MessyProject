import java.io.*;
import java.util.*;

public class Persister
{
    public static void s(ArrayList<User> u) throws IOException
    {
        File file = new File("users.txt"); // Creates file
        FileWriter fw = new FileWriter(file); // Create fileWriter
        BufferedWriter bw = new BufferedWriter(fw); // Create BufferedWriter
        for(int x=0;x<u.size()-1;x++) // Create a loop
        { // Nicely formatted block
            bw.write(u.get(x).name); // Write first thing
            bw.write(u.get(x).getID()); // Write second thing
        } // Ending parenthesis
    }
}
