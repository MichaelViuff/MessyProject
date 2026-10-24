import java.io.*;
import java.util.*;

public class Persister
{
    public static void s(ArrayList<User> user) throws IOException
    {
        File file = new File("users.txt"); // Creates file
        FileWriter fw = new FileWriter(file); // Create filewriter
        BufferedWriter bw = new BufferedWriter(fw); // Create BufferedWriter
        for(int i=0 ;i<user.size()-1 ;i++) // Create a loop
        { // Nicely formatted block
            bw.write(user.get(i).c_nam); // Write first thing
            bw.write(user.get(i).geti()); // Write second thing
        } // Ending parenthesis
    }
}
