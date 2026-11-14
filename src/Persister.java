import java.io.*;
import java.util.*;

public class Persister
{
    public static void s(ArrayList<User> u) throws IOException
    {
        File file = new File("users.txt"); // Creates file
        FileWriter fw = new FileWriter(file); // Create filewriter
        BufferedWriter bw = new BufferedWriter(fw); // Create BufferedWriter
        for (int x = 0; x < u.size(); x++)
        {
            bw.write(u.get(x).c_nam);
            bw.write(";");
            bw.write(Integer.toString(u.get(x).geti()));
            bw.newLine();
        }
    }
}
