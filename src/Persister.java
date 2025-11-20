import java.io.*;
import java.util.*;

public class Persister
{
    public static void s(ArrayList<User> u) throws IOException
    {
        File file = new File("users.txt"); // Creates file
        FileWriter fw = new FileWriter(file); // Create filewriter
        BufferedWriter bw = new BufferedWriter(fw); // Create BufferedWriter
        for(int x=0;x<u.size()-1;x++) // Create a loop
        {
            bw.write(u.get(x).name + "\n");
            bw.write(u.get(x).geti() + "\n");
        }

        bw.close();
    }
    }
}
