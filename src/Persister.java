import java.io.*;
import java.util.*;

public class Persister
{
  public static void save(ArrayList<User> user) throws IOException
  {
    File file = new File("users.txt"); // Creates file
    FileWriter fileWriter = new FileWriter(file); // Create file writer
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // Create BufferedWriter
    for (int x = 0; x < user.size() - 1; x++) // For loop writes data to file
    {
      bufferedWriter.write(user.get(x).client_name);
      bufferedWriter.write(user.get(x).getId());
    }
  }
}
