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
        {
            bw.write(u.get(x).c_nam); // Write name
            bw.write(u.get(x).geti()); // Write ID
        }
    }
}
