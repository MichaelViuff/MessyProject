import java.io.*;
import java.util.*;

public class Persister
{
    public static void s(ArrayList<User> u, String fileName) throws IOException
    {
        File file = new File(fileName);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int x = 0; x < u.size(); x++)
        {
            bw.write(u.get(x).c_nam);
            bw.write(" "); // Adds a space between name and number
            bw.write(String.valueOf(u.get(x).geti())); // Fixed: converts int to String
            bw.newLine(); // Moves to the next line for the next user
        }
        bw.close(); // Crucial: saves/flushes the data into users.txt
    }
}
