import java.io.*;
import java.util.*;

public class Persister
{
    public static void s(UserList userList) throws IOException
    {
        ArrayList<User> u = userList.getu();
        File file = new File("users.txt"); // Creates file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file)))
        {
            for(int x=0;x<u.size();x++) // Create a loop
            { // Nicely formatted block
                bw.write(u.get(x).c_nam + ";" + u.get(x).geti()); // Write first thing
                bw.newLine();
            } // Ending parenthesis
        }
    }
}
