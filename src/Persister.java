import java.io.*;
import java.util.*;

public class Persister
{
    public static void s(ArrayList<User> u) throws IOException
    {
        File file = new File("users.txt"); // Creates file
        FileWriter fw = new FileWriter(file); // Create fileWriter
        BufferedWriter bw = new BufferedWriter(fw); // Create BufferedWriter
      // Create a loop
      for (User user : u) {
        bw.write(user.name); // Write first thing
        bw.write(user.getID()); // Write second thing
      }
    }
}
